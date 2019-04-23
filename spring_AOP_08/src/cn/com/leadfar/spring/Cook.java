package cn.com.leadfar.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Cook implements Ordered{

	@Override
	public int getOrder() {
		return 2;
	}

	@Before("execution(* cn.com.leadfar.spring.MeInterface.*(..)) || execution(* cn.com.leadfar.spring.YouInterface.*(..))")
	public void cook01(){
		System.out.println("ื๖ทน");
	}
	
	@After("execution(* cn.com.leadfar.spring.MeInterface.*(..)) || execution(* cn.com.leadfar.spring.YouInterface.*(..))")
	public void cook02(){
		System.out.println("ื๖ทน");
	}
}
