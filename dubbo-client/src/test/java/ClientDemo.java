import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.dubbo.service.ITestService;
public class ClientDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "classpath*:applicationContext.xml" });
		ITestService test = (ITestService) applicationContext.getBean("springservice");
		System.out.println(test.sayHello("我在这里消费！！！"));
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
