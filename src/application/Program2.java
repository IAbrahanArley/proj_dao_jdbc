package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("========= Test1: Department Insert =========");
		Department dep = new Department(null, "Utilitarios");
		depDao.insert(dep);
		System.out.println("Inserted!"  + dep.getId());

		System.out.println("========= Test2: Department Delete =========");
		depDao.deleteById(5);
		System.out.println("Deleted!");

	}
}
