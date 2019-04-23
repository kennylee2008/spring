利用Spring动态代理分离关注点
	- 用Spring自动创建动态代理实现分离关注点（避免大量的重复代码）
		* 需要引入三个额外的依赖包：aopalliance.jar/aspectjrt.jar/aspectjweaver.jar
		* 在配置文件中加上：<aop:aspectj-autoproxy/>
		* 在关注点（切面：Aspect）的类前面用注解：@Aspect定义
		* 在关注点的方法（这些方法相当于是一个通知的处理方法）的前面，用@After/@Before/@Around来定义通知的类型，如：
		  @Before("execution(* cn.com.leadfar.spring.MeInterface.*(..)) || execution(* cn.com.leadfar.spring.YouInterface.*(..))")
		  public void dress(){ ...
		  
		  即在调用真正的业务逻辑方法之前，先执行这个方法（dress），里面的表达式描述了在执行哪些业务逻辑方法之前会得到通知！