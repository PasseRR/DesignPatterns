package csii.structural.test;

import java.lang.reflect.Proxy;

import csii.structural.proxy.dynamicproxy.ProxyHandler;
import csii.structural.proxy.dynamicproxy.RealSubject;
import csii.structural.proxy.dynamicproxy.Subject;

/**
 * 动态代理测试
 * @author xiehai
 * @date 2013-8-9 下午04:04:57 
 */
public class Test_DynamicProxy {
	public static void main(String[] args) {
		//method 1
		ProxyHandler ph = new ProxyHandler();
		Subject subject = (Subject) ph.createProxy(new RealSubject());
		subject.askForLeave();		
		System.out.println();
		//method 2
		Subject subject2 = (Subject)Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
												 RealSubject.class.getInterfaces(), //得到一个Class数组,只有一个Subject元素
												 ph);
		subject2.askForLeave();
		System.out.println();
		//method 3
		Subject subject3 = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), 
												 new Class[]{Subject.class},
												 ph);
		subject3.askForLeave();
	}
}
