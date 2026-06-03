package org.snad.uni;

public class PersonController {
	public static void main(String[] args) {
		Address address = new Address(1002, "Warangal", "Telangana");
		Person person = new Person(102,"Prasad",address);
		Person_Dao dao = new Person_Dao();
//		dao.save(address);
//		dao.save(person);
//		dao.fetch(105);
//		dao.update(105, "Kolipe Karthik");
//		dao.updateAddress(101, "Andhra Pradesh");
//		dao.delete(102);
		dao.fetchAll();
	}

}
