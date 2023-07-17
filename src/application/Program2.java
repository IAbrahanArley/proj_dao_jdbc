package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("========= Test1: Department Insert =========");
		Department dep = new Department(10, "Utilitarios");
		depDao.insert(dep);
		System.out.println("Inserted!"  + dep.getId());

		System.out.println("========= Test2: Department Delete =========");
		depDao.deleteById(9);
		System.out.println("Deleted!");
		
		System.out.println("========= Test3: Department FindById =========");
		 dep = depDao.findById(1);
		System.out.println(dep);
		
		System.out.println("========= Test4: Department Update =========");
		dep = depDao.findById(2);
		dep.setName("Estofados");
		depDao.update(dep);
		System.out.println("Update complete");
		
		System.out.println("========= Test5: Department findAll =========");
		List<Department> list = new ArrayList<>();
		list = depDao.findAll();
		for (Department x : list) {
			System.out.println(x);
		}

		

	}
}
