package org.snad;

import java.util.ArrayList;
import java.util.List;

public class StudentsController {
	public static void main(String[] args) {
		College college = new College(222,"Brilliant","AbdullapurMet");
		Students s1 = new Students(04,"sai",college);
		Students s2 = new Students(05,"prasad",college);
		Students s3 = new Students(06,"rani",college);
		
		List<Students> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Students_Dao dao = new Students_Dao();
//		dao.save(list);
//		dao.fetch(222);
//		dao.fetchStudent(4);
		dao.fetchAll();
	}

}
