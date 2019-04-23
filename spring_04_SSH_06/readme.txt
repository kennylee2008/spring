简单集成SSH，并实现一个简单的添加操作！
	- 为了保证在Service中以及DAO中使用相同的Session对象，我们使用getCurrentSession()方法来获得Session对象
		* 需要配置hibernate配置文件，增加如下配置：
		<property name="hibernate.current_session_context_class">thread</property>