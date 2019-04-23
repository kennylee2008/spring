利用Spring动态代理分离关注点
	- 小练习参考代码
	
	- MethodBeforeAdvice
    <aop:config>
    	<aop:advisor advice-ref="logAdvice1" pointcut="execution(* cn.com.leadfar.spring.UserService.*(..))"/>
    </aop:config>	
	
	- AfterReturningAdvice
	- MethodInterceptor