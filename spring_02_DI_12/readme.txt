通过注解（annotation）来进行注入！
	- 在spring配置文件中增加：<context:component-scan base-package="cn.com.leadfar"/>
	  意思是让spring自动扫描类路径中指定包（及其子包）下面所有的类型，并把标识了特殊注解的类型进行注册和管理
	- 在需要spring管理的类型前面，用@Component注解定义
	- 可用@Scope来定义其Scope属性的值