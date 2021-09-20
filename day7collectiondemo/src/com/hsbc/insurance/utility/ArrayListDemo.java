package com.hsbc.insurance.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//raw array list
		//heterogeneous
		//diamond operator
		List<String> list=new ArrayList<>();
		//list.add(45);
		list.add("Parameswari");
		//list.add(true);
		//list.add(70.5f);
		
		//method1
		//iteration
		Iterator itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//method 2
		for(Object object:list)
			System.out.println(object);
		
		//method 3
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		
		
		
		
		
		
		
		
	}

}
