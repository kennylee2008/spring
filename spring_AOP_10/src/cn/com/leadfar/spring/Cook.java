package cn.com.leadfar.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class Cook{
	public Object cook(ProceedingJoinPoint jp){
		
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
