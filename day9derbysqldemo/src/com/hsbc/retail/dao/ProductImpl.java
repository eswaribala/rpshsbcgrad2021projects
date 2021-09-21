package com.hsbc.retail.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

import com.hsbc.retail.models.Apparel;
import com.hsbc.retail.models.Electronics;
import com.hsbc.retail.models.FoodItems;
import com.hsbc.retail.models.Product;

public class ProductImpl implements ProductDao{

	private static long foodKey,electKey,appKey=0;
	private Hashtable<Long, FoodItems> foodht;
	private Hashtable<Long, Electronics> electht;
	private Hashtable<Long, Apparel> appht;
	private List<Product> productList=null;
	
	@Override
	public boolean addProduct(List<Product> products) {
		
		boolean productAdded=false;

		//hashtable which stores data in heap
		foodht=new Hashtable<Long,FoodItems>();
		electht=new Hashtable<Long,Electronics>();
		appht=new Hashtable<Long,Apparel>();
		//skeleton code
		
		for(Product product:products) {
			if(product instanceof FoodItems) {
				foodKey++;
				foodht.put(foodKey, (FoodItems)product);
				productAdded=true;
			}
			if(product instanceof Electronics) {
				electKey++;
				electht.put(electKey, (Electronics)product);
				productAdded=true;
			}
			if(product instanceof Apparel) {
				appKey++;
				appht.put(appKey, (Apparel)product);
				productAdded=true;
			}
		}
		
		return productAdded;
		
		
	}

	@Override
	public List<Product> getAllProducts(int type) {
		if(type==1) {
			Collection<FoodItems> foodItems = foodht.values();
			productList = new ArrayList<>(foodItems);
			
		} else if(type==2) {
			Collection<Electronics> electronics = electht.values();
			productList = new ArrayList<>(electronics);
			
		} else if(type==3) {
			Collection<Apparel> apparels = appht.values();
			productList = new ArrayList<>(apparels);
	
		}
		
		return productList;

	}

}
