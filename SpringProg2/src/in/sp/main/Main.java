package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std=(Student) con.getBean("stdId1");
		std.display();
		
	}

}
