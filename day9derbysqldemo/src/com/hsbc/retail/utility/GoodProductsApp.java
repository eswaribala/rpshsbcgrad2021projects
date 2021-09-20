package com.hsbc.retail.utility;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.hsbc.retail.bl.ProductBL;
import com.hsbc.retail.bl.ProductBLImpl;
import com.hsbc.retail.exceptions.DBConnCreationException;
import com.hsbc.retail.models.FoodItems;
import com.hsbc.retail.models.Product;
import com.hsbc.retail.models.VegeterianType;

public class GoodProductsApp {

	private static ProductBL productBL;
	static
	{
		productBL=new ProductBLImpl();
	}
	
	private static void addProducts()
	{
		List<Product> productList=new ArrayList<Product>();
		List<FoodItems> foodItemsList=new ArrayList<FoodItems>();
		FoodItems foodItems=null;
		for(int i=0;i<100;i++)
		{
			foodItems=new FoodItems(i,"foodItem"+i,
					new Random().nextInt(10000),new Random().nextInt(1000),
					LocalDate.of(2019+new Random().nextInt(1), new Random().nextInt(10)+1,
							new Random().nextInt(26)+1),
					LocalDate.of(2019+new Random().nextInt(5), new Random().nextInt(10)+1,
							new Random().nextInt(26)+1),
					VegeterianType.YES
					);
			
			foodItemsList.add(foodItems);			
		}
		productList.addAll(foodItemsList);
		try {
			productBL.addProduct(productList);
		} catch (DBConnCreationException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	private static void getAllProducts()
	{
		try {
			for(Product product : productBL.getAllProducts(1))
			{
				
				System.out.println(product);
			}
		} catch (DBConnCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//addProducts();
		getAllProducts();
	}

}
