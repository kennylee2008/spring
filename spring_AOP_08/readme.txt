����Spring��̬��������ע��
	- ��Spring�Զ�������̬����ʵ�ַ����ע�㣨����������ظ����룩
		* ��Ҫ���������������������aopalliance.jar/aspectjrt.jar/aspectjweaver.jar
		* �������ļ��м��ϣ�<aop:aspectj-autoproxy/>
		* �ڹ�ע�㣨���棺Aspect������ǰ����ע�⣺@Aspect����
		* �ڹ�ע��ķ�������Щ�����൱����һ��֪ͨ�Ĵ���������ǰ�棬��@After/@Before/@Around������֪ͨ�����ͣ��磺
		  @Before("execution(* cn.com.leadfar.spring.MeInterface.*(..)) || execution(* cn.com.leadfar.spring.YouInterface.*(..))")
		  public void dress(){ ...
		  
		  ���ڵ���������ҵ���߼�����֮ǰ����ִ�����������dress��������ı��ʽ��������ִ����Щҵ���߼�����֮ǰ��õ�֪ͨ��