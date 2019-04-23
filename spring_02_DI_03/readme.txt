DI依赖注入的基本概念
	- 在一个单例(singleton)的对象中不能通过常规的注入方法来注入一个多例(prototype)的对象
		* 可以在单例的类中实现BeanFactoryAware接口，这个接口有一个方法：setBeanFactory
		  Spring在创建单例对象的同时，会把BeanFactory对象进行注入，这样，我们在单例的对象
		  中，就可以直接调用beanFactory.getBean方法来获得多例对象了！