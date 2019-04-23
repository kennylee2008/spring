package cn.com.leadfar.spring;

import javax.annotation.Resource;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class LogManager {
	
	@Resource
	private LogService logService;
	
	public Object doLog(ProceedingJoinPoint jp){
		Object ret = null;
		
		String methodName = jp.getSignature().getName();
		
		logService.addLog(methodName);
		
		try {
			ret = jp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return ret;
	}
}
