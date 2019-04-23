package cn.com.leadfar.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Cook implements Ordered{

	@Override
	public int getOrder() {
		return 2;
	}

	@Around("execution(* cn.com.leadfar.spring.MeInterface.*(..)) || execution(* cn.com.leadfar.spring.YouInterface.*(..))")
	public Object cook01(ProceedingJoinPoint jp){
		
		//之前
		System.out.println("做饭");
		
		//继续往下执行
		Object returnValue = null;
		try {
			 returnValue = jp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		//之后
		System.out.println("做饭");
		
		return returnValue;
	}
	
}
