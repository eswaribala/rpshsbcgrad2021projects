package com.hsbc.happytrip.utilities;

import java.util.Random;
import java.util.Scanner;

import com.hsbc.happytrip.models.State;

public class TwodimArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test string
		String s1="HSBC";
		String s2=s1;
		System.out.println(s1==s2);
		s2="Duetsche";
		System.out.println(s1==s2);
		
		String s3="HSBC";
		System.out.println(s1==s3);
		//mutable
		//synchronized--> multi threaded env
		//performance is low
		StringBuffer sbuffer=new StringBuffer("HSBC");
		long startTime=System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
		 sbuffer.append("Technology");
		long endTime=System.currentTimeMillis();
		System.out.println((endTime-startTime)+"ms");
		
		//performance is better
		StringBuilder sBuilder=new StringBuilder("HSBC");
	    startTime=System.currentTimeMillis();
	    for(int i=0;i<1000000;i++)
		 sBuilder.append("Technology");
		endTime=System.currentTimeMillis();
		System.out.println((endTime-startTime)+"ms");
		
		
		
		int rows=0,cols=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no of rows");
		rows=scanner.nextInt();
		scanner.nextLine();
		
		
		//declare the array
		State[][] states=new State[rows][];		//jagged array
		//initialize the array
		
		for(int i=0;i<states.length;i++) {
			System.out.println("Enter no of cols");
			cols=scanner.nextInt();
			scanner.nextLine();
			states[i]=new State[cols];
			for(int j=0;j<states[i].length;j++) {
				states[i][j]=new State(new Random().nextInt(100),"State"+i+j);
			}
		}

		for(int i=0;i<states.length;i++) {
			for(int j=0;j<states[i].length;j++) {
				System.out.println(states[i][j]);
			}
		}

		
	}

}
