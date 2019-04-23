package cn.com.leadfar.spring;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("you")
public class YouProxy implements YouInterface {
	@Resource
	private Cook cook;
	
	@Resource
	private Driver driver;
	
	@Resource
	private Servant01 servant01;
	
	@Resource
	private Servant02 servant02;
	
	@Resource(name="realYou")
	private You you;
	
	@Override
	public void playInChangCheng() {
		servant01.dress(); //关注点
		cook.cook(); //关注点
		driver.drive(); //关注点
		
		you.playInChangCheng();
		
		cook.cook(); //关注点
		servant02.undress(); //关注点
	}

	@Override
	public void playInGuGong() {
		servant01.dress(); //关注点
		cook.cook(); //关注点
		driver.drive(); //关注点
		
		you.playInGuGong();
		
		cook.cook(); //关注点
		servant02.undress(); //关注点
	}

}
