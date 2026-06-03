package org.snad.uni;

import java.util.*;

public class Dept_Controller {
	public static void main(String[] args) {
		Employees employee1 = new Employees(1001,"Anu");
		Employees employee2 = new Employees(1002,"Radha");
		Employees employee3 = new Employees(1003,"sai");
		Employees employee4 = new Employees(1004,"Prasad");
		
		List<Employees> list = new ArrayList<>();
		list.add(employee1);
		list.add(employee2);
//		list.add(employee3);
//		list.add(employee4);
		Department department = new Department(10,"Development",list);
		
		Dept_Dao dao = new Dept_Dao();
//		dao.save(department);
//		dao.delete(20,1003);
//		dao.deleteDept(10);
//		dao.fetch(20);
		dao.fetchAll();
	}

}
