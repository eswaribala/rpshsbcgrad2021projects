package com.hsbc.happytrip.utilities;

public class NestedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(Object obj:args) {
			System.out.println(obj);
		}
		try{
			try{
			String n[]= new String[args.length-1];
			System.out.println(n[0]);	
			}
		   catch(ArrayIndexOutOfBoundsException ae){
		   System.out.println("Out of bounds");}
		}
		catch(NegativeArraySizeException ne){
		System.out.println("Array size cannot be negative");
		}
		

	}

}
