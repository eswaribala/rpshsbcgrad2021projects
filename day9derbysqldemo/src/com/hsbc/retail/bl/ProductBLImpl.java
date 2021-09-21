package com.hsbc.retail.bl;

import java.sql.SQLException;
import java.util.List;

import com.hsbc.retail.dao.ProductDao;
import com.hsbc.retail.dao.ProductImpl;
import com.hsbc.retail.exceptions.DBConnCreationException;
import com.hsbc.retail.models.Product;

public class ProductBLImpl implements ProductBL {

	private ProductDao productDao;
	
	public ProductBLImpl() 
	{
		
		productDao=new ProductImpl();
		
	}
	
	@Override
	public boolean addProduct(List<Product> products)  {
		boolean status=false;
		// TODO Auto-generated method stub
		
			status=productDao.addProduct(products);
		
		return status;
	}

	@Override
	public List<Product> getAllProducts(int type) {
		// TODO Auto-generated method stub
		List<Product> productList=null;
		
			productList=productDao.getAllProducts(type);
	
		return productList;
	}

}
