简单集成SSH，并实现一个简单的添加操作！
	- 本项目演示了如果在一个Service对象中访问另外一个Service对象的方法，我们很难决定在Service的方法中
	  是否需要添加事务管理的代码，因为一个Service方法是否需要增加事务管理的代码，将取决于其执行的上下文
	  环境。
	- 通常的规则是：
		* 一个Service方法被执行的时候
			- 如果其上下文环境中已经有事务，则使用这个事务
			- 如果其上下文环境中没有事务，则创建一个新的事务
			
			--> 使用Spring声明式的事务管理，将很容易达到这个目标（请看下一个项目）