简单集成SSH，并实现一个简单的添加操作！
	- 使用Spring声明式的事务管理
		* 把SessionFactory、Session、Transaction交给Spring去管理
			- 理解如何配置SessionFactory和事务管理
			- 理解事务管理的基本概念
			- 理解Session的管理方式
			
		* 编程方法：
			Action调用Service
			Service调用DAO
			在DAO中注入SessionFactory，通过SessionFactory得到Session进行CRUD操作
			所有代码中都不需要关注事务管理代码，以及Session的打开和关闭！