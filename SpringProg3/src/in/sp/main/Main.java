package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		String path="/in/sp/config/applicationContext.xml";
		ApplicationContext con=new ClassPathXmlApplicationContext(path);
		
		Student std=(Student) con.getBean("student");
		std.display();
	}

}
