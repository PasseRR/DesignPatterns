package csii.structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler implements InvocationHandler {
	private Object obj;
	public ProxyHandler() {
		// TODO Auto-generated constructor stub
	}
	public ProxyHandler(Object obj){
		this.obj = obj;
	}
	public Object createProxy(Object obj){
		this.obj = obj;
		return Proxy.newProxyInstance(this.obj.getClass().getClassLoader(), 
									  this.obj.getClass().getInterfaces(), 
									  this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object obj;
		System.out.println("ͬѧ���೤,������1���.");
		System.out.println("�೤���õ�,�Ұ�����һ����ʦ�������!");
		System.out.println("......");
		System.out.println("�೤����ʦ,xxxҪ���1��.");
		obj = method.invoke(this.obj, args);
		System.out.println("ͬѧ��лл�೤.");
		return obj;
	}
}
