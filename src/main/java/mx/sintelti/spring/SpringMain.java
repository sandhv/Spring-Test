package mx.sintelti.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationcontext = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Factura factura = applicationcontext.getBean("factura",Factura.class);
		factura.imprimirFactura();
	}
	
}
