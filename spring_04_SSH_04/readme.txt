简单集成SSH，并实现一个简单的添加操作！
	- 假设在添加人员的同时，我们也可以同时添加一个组！
		* 如果把事务管理的边界定义在DAO上，那么，当其中一种数据添加失败，并不会导致另外一个数据的回滚！因为
		  两个添加操作根本不是一个事务！