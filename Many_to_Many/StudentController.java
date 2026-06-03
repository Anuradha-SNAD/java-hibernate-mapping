package org.snad;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
	public static void main(String[] args) {
		Courses course = new Courses(1234,"Java-fullstack",24000);
		Courses course2 = new Courses(5678,"Python-fullstack",25000);
		Courses course3 = new Courses(3456,"Devops",30000);
		List<Courses> c = new ArrayList<>();
		c.add(course3);
		
		Student s1 = new Student(1,"Anu",c);
		Student s2 = new Student(2,"Prasad",c);
		Student s3 = new Student(4,"Vara",c);
		
		List<Student> list = new ArrayList<>();
//		list.add(s1);
//		list.add(s2);
		list.add(s3);
		StudentDao dao = new StudentDao();
//		dao.save(list);
// 		dao.fetch(4);
//		dao.fetchAll();
		dao.delete(3);
	}

}
