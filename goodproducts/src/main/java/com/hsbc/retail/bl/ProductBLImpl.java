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
	public boolean addProduct(List<Product> products) throws DBConnCreationException {
		boolean status=false;
		// TODO Auto-generated method stub
		try {
			status=productDao.addProduct(products);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DBConnCreationException("Derby Connection Error");
		}
		return status;
	}

	@Override
	public List<Product> getAllProducts(int type) throws DBConnCreationException {
		// TODO Auto-generated method stub
		List<Product> productList=null;
		try {
			productList=productDao.getAllProducts(type);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DBConnCreationException("Derby Connection Error");
		}
		return productList;
	}

}
