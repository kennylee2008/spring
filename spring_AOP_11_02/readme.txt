����Spring��̬��������ע��
	- С��ϰ�ο�����
	
	- MethodBeforeAdvice
    <aop:config>
    	<aop:advisor advice-ref="logAdvice1" pointcut="execution(* cn.com.leadfar.spring.UserService.*(..))"/>
    </aop:config>	
	
	- AfterReturningAdvice
	- MethodInterceptor