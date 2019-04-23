package cn.com.leadfar.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Servant01 implements Ordered{
	
	@Override
	public int getOrder() {
		return 1;
	}

	@Before("execution(* cn.com.leadfar.spring.MeInterface.*(..)) || execution(* cn.com.leadfar.spring.YouInterface.*(..))")
	public void dress(){
		System.out.println("´©ÒÂ·þ");
	}
}
