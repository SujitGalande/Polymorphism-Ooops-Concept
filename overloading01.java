package com.Polymorphism;

import java.util.Scanner;

public class overloading01 {
	
	// create Method 01
	public int add(int a, int b) 
	{
		int add= a+b;
		return add;	
	}
	
	// create Method 02
	public double add(double a, double b) 
	{
	double add = a+b;
	return add;
	
	}
	
	// create Method 03
	public double add (double a) 
	{
      double add =a;
      return add;
   
     }
	  // create Method 04
	public int add (int a,int b,int c) 
	{
		int add = a+b+c;
		return add;
		
	}
	
	public static void main(String[]args) 
	{
		// Create a scanner object
		
		Scanner scan = new Scanner(System.in);
		
		scan.close();
		
		System.out.println("Enter The Frist Number");
		
		double store1 = scan.nextDouble();
		
		System.out.println("Enter The Second Number");
		
		double store2 = scan.nextDouble();
		
		System.out.println("Enter The Third Number");
		
		int store3 = scan.nextInt();
		
         System.out.println("Enter The fourth Number");
		
		int store4 = scan.nextInt();
		
         System.out.println("Enter The Fifth Number");
		
		int store5 = scan.nextInt();
		
		
		
		System.out.println("Store1 Value :" + store1);
		System.out.println("Store2 Value :" + store2);
		System.out.println("Store3 Value :" + store3);
		System.out.println("Store4 Value :" + store4);
		System.out.println("Store5 Value :" + store5);
		
		// Create an object
		
		overloading01 obj = new overloading01();
		double result1 = obj.add( store1,  store2);
		int result2 = obj.add(store3, store4);
		double result3 = obj.add(store1);
		int result4 = obj.add(store3, store4, store5);
		
		System.out.println("Addition of two decimal value :" +result1 );
		System.out.println("Addition of two dec value :" +result2 );
		System.out.println("Addition of two int value :" +result3 );
		System.out.println("Addition of twovalue :" +result4 );
      }
    }