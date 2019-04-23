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
		
		//֮ǰ
		System.out.println("����");
		
		//��������ִ��
		Object returnValue = null;
		try {
			 returnValue = jp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		//֮��
		System.out.println("����");
		
		return returnValue;
	}
	
}
