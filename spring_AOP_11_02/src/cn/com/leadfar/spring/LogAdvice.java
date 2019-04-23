package cn.com.leadfar.spring;

import java.lang.reflect.Method;

import javax.annotation.Resource;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

@Component
public class LogAdvice implements MethodBeforeAdvice {

	@Resource
	private LogService logService;
	
	@Override
	public void before(Method m, Object[] arg1, Object arg2)
			throws Throwable {
		String methodName = m.getName();
		logService.addLog(methodName);
	}

}
