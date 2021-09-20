package com.hsbc.retail.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.hsbc.retail.helpers.DBHelper;
import com.hsbc.retail.models.Apparel;
import com.hsbc.retail.models.Electronics;
import com.hsbc.retail.models.FoodItems;
import com.hsbc.retail.models.MaterialType;
import com.hsbc.retail.models.Product;
import com.hsbc.retail.models.SizeType;
import com.hsbc.retail.models.VegeterianType;

public class ProductImpl implements ProductDao{

	private Connection conn;
	private Statement stmt;
	private PreparedStatement pre,apre,fpre,epre;
	private CallableStatement callableStatement;
	private ResultSet resultSet;
	private ResultSetMetaData resultSetMetaData;
	private boolean status;
	private ResourceBundle resourceBundle;
	
	
	
	public ProductImpl() 
	{
		// db conn test
		/*
		 * try { conn=DBHelper.getConnection(); System.out.println("DB Conn created"); }
		 * catch (SQLException e) { // TODO Auto-generated catch block
		 * //e.printStackTrace(); System.out.println(e.getMessage()); } finally { try {
		 * conn.close(); } catch (SQLException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } }
		 */
		
		resourceBundle=ResourceBundle.getBundle("com/hsbc/retail/resources/db");
	}
	
	@Override
	public boolean addProduct(List<Product> products) throws SQLException {
		// TODO Auto-generated method stub
		//insert the product in to product
		System.out.println(products.size());
		conn=DBHelper.getConnection();
		Apparel apparel=null;
		FoodItems foodItems=null;
		Electronics electronics=null;
		pre=conn.prepareStatement(resourceBundle.getString("addproduct"));
		apre=conn.prepareStatement(resourceBundle.getString("addapparel"));
		fpre=conn.prepareStatement(resourceBundle.getString("addfooditems"));
		epre=conn.prepareStatement(resourceBundle.getString("addelectronics"));
		for(Product product:products)
		{			
			
			pre.setLong(1, product.getItemCode());
			pre.setString(2, product.getName());
			pre.setInt(3, product.getQty());
			pre.setInt(4, product.getUnitPrice());
			
			if(product instanceof Apparel)
			{
				apparel=(Apparel) product;
				
				apre.setLong(1, apparel.getItemCode());
				apre.setString(2, apparel.getMaterialType().toString());
				apre.setString(3, apparel.getSize().toString());
				
			}
			if(product instanceof FoodItems)
			{
				foodItems=(FoodItems) product;
				
				fpre.setLong(1, foodItems.getItemCode());
				
				if(foodItems.getVegeterian().equals(VegeterianType.YES))
				  fpre.setInt(2, 1);
				else
					fpre.setInt(2, 0);
				
				fpre.setDate(3, Date.valueOf(foodItems.getDateOfExpiry()));
				fpre.setDate(4, Date.valueOf(foodItems.getDateOfManufacturing()));
				
			}
			if(product instanceof Electronics)
			{
				electronics=(Electronics) product;
				
				epre.setLong(1, electronics.getItemCode());
				epre.setInt(2, electronics.getWarranty());
				
			}
			
			pre.addBatch();
			fpre.addBatch();
			//epre.addBatch();
			//apre.addBatch();
			
		}
		
		int[] productCount =pre.executeBatch();
		//int[] apparelCount=apre.executeBatch();
		int[] foodItemsCount=fpre.executeBatch();
		//int[] electronicsCount=epre.executeBatch();
		conn.commit();
		conn.close();
		status=true;
		return status;
	}

	@Override
	public List<Product> getAllProducts(int type) throws SQLException {
		// TODO Auto-generated method stub
		conn=DBHelper.getConnection();
		stmt=conn.createStatement();
		List<Product> productList=new ArrayList<Product>();
		List<FoodItems> foodItemsList=new ArrayList<FoodItems>();
		List<Apparel> apparelList=new ArrayList<Apparel>();
		List<Electronics> electronicsList=new ArrayList<Electronics>();
		Apparel apparel=null;
		FoodItems foodItems=null;
		Electronics electronics=null;
		if(type==1)
		{
		
		  resultSet=stmt.executeQuery(resourceBundle.getString("selectfooditems"));
		  
		  while(resultSet.next())
		  {
			  foodItems=new FoodItems();
			  foodItems.setItemCode(Long.parseLong(resultSet.getString(1)));
			  foodItems.setName(resultSet.getString(2));
			  foodItems.setQty(Integer.parseInt(resultSet.getString(3)));
			  
			  if(resultSet.getString(4).equals(1))
				  
			   foodItems.setVegeterian(VegeterianType.valueOf
					  ("YES"));
			  else
				  foodItems.setVegeterian(VegeterianType.valueOf
						  ("NO"));
			  foodItemsList.add(foodItems);
		  }
			productList.addAll(foodItemsList);
		}
		if(type==2)
		{
		
		  resultSet=stmt.executeQuery(resourceBundle.getString("selectapparel"));
		  while(resultSet.next())
		  {
			  apparel=new Apparel();
			  apparel.setItemCode(Long.parseLong(resultSet.getString(1)));
			  apparel.setName(resultSet.getString(2));
			  apparel.setQty(Integer.parseInt(resultSet.getString(3)));			 
			  apparel.setSize(SizeType.valueOf(resultSet.getString(4)));
			  apparel.setMaterialType(MaterialType.valueOf(resultSet.getString(5)));
			  apparelList.add(apparel);
		  }
		  productList.addAll(apparelList);
		}
		
		if(type==3)
		{
		
		  resultSet=stmt.executeQuery(resourceBundle.getString("selectelectronics"));
		  while(resultSet.next())
		  {
			  electronics=new Electronics();
			  electronics.setItemCode(Long.parseLong(resultSet.getString(1)));
			  electronics.setName(resultSet.getString(2));
			  electronics.setQty(Integer.parseInt(resultSet.getString(3)));			 
			  electronics.setWarranty(Byte.parseByte(resultSet.getString(4)));
			  electronicsList.add(electronics);
		  }
		  productList.addAll(electronicsList);
		}
		
		
		conn.close();
	
		
		return productList;
	}

}
