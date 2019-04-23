package cn.com.leadfar.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class Cook{
	public Object cook(ProceedingJoinPoint jp){
		
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
