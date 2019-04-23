package cn.com.leadfar.spring;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("me")
public class Me {
	
	@Resource
	private Cook cook;
	
	@Resource
	private Driver driver;
	
	@Resource
	private Servant01 servant01;
	
	@Resource
	private Servant02 servant02;
	
	public void play(){
		
		//职责转移给了其它人
		
		servant01.dress(); //关注点
		cook.cook(); //关注点
		driver.drive(); //关注点
		System.out.println("玩");
		cook.cook(); //关注点
		servant02.undress(); //关注点
		
		//但是，这里面的问题在于：
		//依赖关系太多，我无法专心干我自己的事情，我得理解所有的流程，我得知道我有多少个仆人，我的知道这些仆人是干什么的
		//等等等等。。。。
	}
}
