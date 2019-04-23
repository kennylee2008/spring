package cn.com.leadfar.spring;

import javax.annotation.Resource;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component
public class LogAdvice implements MethodInterceptor {

	@Resource
	private LogService logService;
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String methodName = invocation.getMethod().getName();
		Object obj = invocation.proceed();
		logService.addLog(methodName);
		return obj;
	}
}
