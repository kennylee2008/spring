package cn.com.leadfar.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import javax.annotation.Resource;

public class DynaProxy implements InvocationHandler {

	private Cook cook;
	
	private Driver driver;
	
	private Servant01 servant01;
	
	private Servant02 servant02;
	
	private Object realObj;
	
	public static Object newInstance(
			Object realObj,Cook cook,Driver driver,
			Servant01 servant01,Servant02 servant02
			){
		DynaProxy dp = new DynaProxy();
		dp.realObj = realObj;
		dp.cook = cook;
		dp.driver = driver;
		dp.servant01 = servant01;
		dp.servant02 = servant02;
		
		Class realObjClass = realObj.getClass();
		Object proxy = Proxy.newProxyInstance(realObjClass.getClassLoader(), 
				realObjClass.getInterfaces() , 
				dp);
		return proxy;
	}
	
	private DynaProxy(){
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		servant01.dress(); //��ע��
		cook.cook(); //��ע��
		driver.drive(); //��ע��
		
		//������!!!
		Object obj = method.invoke(realObj, args);
		
		cook.cook(); //��ע��
		servant02.undress(); //��ע��
		
		return obj;
	}

}
