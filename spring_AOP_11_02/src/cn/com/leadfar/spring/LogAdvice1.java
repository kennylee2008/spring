package cn.com.leadfar.spring;

import java.lang.reflect.Method;

import javax.annotation.Resource;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

@Component
public class LogAdvice1 implements AfterReturningAdvice {

	@Resource
	private LogService logService;
	
	@Override
	public void afterReturning(Object arg0, Method m, Object[] arg2,
			Object arg3) throws Throwable {
		String methodName = m.getName();
		logService.addLog(methodName);
	}

}
