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
		System.out.println("同学：班长,我想请1天假.");
		System.out.println("班长：好的,我帮你问一下老师的意见吧!");
		System.out.println("......");
		System.out.println("班长：老师,xxx要请假1天.");
		obj = method.invoke(this.obj, args);
		System.out.println("同学：谢谢班长.");
		return obj;
	}
}
