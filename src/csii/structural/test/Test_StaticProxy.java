package csii.structural.test;


import csii.structural.proxy.staticproxy.ProxySubject;

/**
 * 静态代理测试类
 * @author xiehai
 * @date 2013-8-9 下午03:50:45 
 */
public class Test_StaticProxy {
	public static void main(String[] args) {
		new ProxySubject().requestForLeave();
	}
}
