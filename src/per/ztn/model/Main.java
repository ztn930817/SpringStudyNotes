package per.ztn.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld=(HelloWorld) ctx.getBean("helloworld");
		helloWorld.hello();
	}
}
