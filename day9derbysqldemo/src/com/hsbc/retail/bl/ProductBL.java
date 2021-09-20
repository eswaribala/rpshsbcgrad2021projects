package com.hsbc.retail.bl;

import java.sql.SQLException;
import java.util.List;

import com.hsbc.retail.exceptions.DBConnCreationException;
import com.hsbc.retail.models.Product;

public interface ProductBL {
	boolean addProduct(List<Product> products) throws DBConnCreationException;
	List<Product> getAllProducts(int type) throws DBConnCreationException;

}
