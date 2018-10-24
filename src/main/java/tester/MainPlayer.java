package tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPlayer {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Tester tester = applicationContext.getBean("testerDvd", Tester.class);
		tester.test();
		
		tester = applicationContext.getBean("testerMp3", Tester.class);
		tester.test();
		
		tester = applicationContext.getBean("testerBlueRay", Tester.class);
		tester.test();
		
		tester = applicationContext.getBean("testerSmarthphone", Tester.class);
		tester.test();
		
	
	}

}

