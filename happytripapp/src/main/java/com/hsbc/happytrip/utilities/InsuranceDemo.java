package com.hsbc.happytrip.utilities;

import java.util.Random;
import java.util.Scanner;

import com.hsbc.happytrip.models.State;

public class InsuranceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=0,cols=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no of rows");
		rows=scanner.nextInt();
		scanner.nextLine();
		
		
		//declare the array
		int[][] premiums=new int[rows][];		//jagged array
		//initialize the array
		
		for(int i=0;i<premiums.length;i++) {
			System.out.println("Enter no of premiums");
			cols=scanner.nextInt();
			scanner.nextLine();
			premiums[i]=new int[cols];
			for(int j=0;j<premiums[i].length;j++) {
				System.out.println("Enter premium amount");
				premiums[i][j]=scanner.nextInt();
				scanner.nextLine();
			}
		}

		for(int i=0;i<premiums.length;i++) {
			for(int j=0;j<premiums[i].length;j++) {
				System.out.print(premiums[i][j]+" ");
			}
			System.out.println("\n");
		}

	}

}
