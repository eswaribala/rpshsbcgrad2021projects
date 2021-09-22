package com.hsbc.retail.bl;

import java.sql.SQLException;
import java.util.List;

import com.hsbc.retail.exceptions.DBConnCreationException;
import com.hsbc.retail.models.Product;

public interface ProductBL {
	//create
	boolean addProduct(List<Product> products) throws DBConnCreationException;
//retrieve
	List<Product> getAllProducts(int type) throws DBConnCreationException;
	
	//update
	Product updateProduct(String name, long itemCode) throws DBConnCreationException;

	//delete

	boolean deleteProduct(long itemCode) throws DBConnCreationException;

}
