	- Spring与Struts2的集成方法
		* 拷贝Struts2和Spring集成的依赖包
		* 在web.xml配置一个Listener（注意需要指定Spring配置文件）
			- 这个Listener的主要作用就是在启动应用服务器的时候，创建BeanFactory，并且把
			  BeanFactory这个对象放入ServletContext中！
		* 在编写Action的时候，用@Controller注解（或者通过配置文件）来定义Action,注入其依赖关系
		* 在配置Action的时候，用Action在Spring中注册的ID，去定义class属性值！