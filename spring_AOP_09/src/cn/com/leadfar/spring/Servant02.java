package cn.com.leadfar.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Servant02 implements Ordered{
	
	@Override
	public int getOrder() {
		return 3;
	}

	@After("execution(* cn.com.leadfar.spring.MeInterface.*(..)) || execution(* cn.com.leadfar.spring.YouInterface.*(..))")
	public void undress(){
		System.out.println("ÍÑÒÂ·þ");
	}
}
