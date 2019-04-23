package cn.com.leadfar.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Driver implements Ordered{
	
	@Override
	public int getOrder() {
		return 3;
	}

	@Before("execution(* cn.com.leadfar.spring.MeInterface.*(..)) || execution(* cn.com.leadfar.spring.YouInterface.*(..))")
	public void drive(){
		System.out.println("¿ª³µ");
	}
}
