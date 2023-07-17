package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("========= Test1: Seller FindById =========");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("========= Test2: Seller FindByDepartmentId =========");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDeparmentId(department);
		for (Seller obj : list) {
			System.out.println(obj);
			
		}
		System.out.println("========= Test3: Seller FindAll =========");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
			
		}
		System.out.println("========= Test4: Seller FindAll =========");
		Seller newSeller = new Seller(null, "abe", "abrahanarley@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Iserted! new Id:" + newSeller.getId());
		
		System.out.println("========= Test5: Seller Update =========");
		seller = sellerDao.findById(1);
		seller.setName("Maria jose");
		sellerDao.update(seller);
		System.out.println("Update complete");
		
		System.out.println("========= Test6: Seller Delete =========");
		sellerDao.deleteById(8);
		System.out.println("Delete complete");

		
		
		
		
		
		
		
		
	}
}