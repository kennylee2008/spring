package cn.com.leadfar.spring;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("me")
public class MyProxy implements MeInterface{
	@Resource
	private Cook cook;
	
	@Resource
	private Driver driver;
	
	@Resource
	private Servant01 servant01;
	
	@Resource
	private Servant02 servant02;
	
	@Resource(name="realMe")
	private Me me;
	
	@Override
	public void play() {
		servant01.dress(); //关注点
		cook.cook(); //关注点
		driver.drive(); //关注点
		
		me.play(); //办正事！！！
		
		cook.cook(); //关注点
		servant02.undress(); //关注点
	}

}
