package com.alkeon.Born;

import java.util.Scanner;

public class Dan{

	 private static Scanner sc;

	public static void main (String []args){
	        sc = new Scanner(System.in);
	        System.out.println("Enter 2 numbers");
	        double first=sc.nextDouble();
	        double second=sc.nextDouble();
	        System.out.println("enter a operator(+,-,/,*,%)");
	        char operator=sc.next().charAt(0);
	        double result=0;
	        switch (operator){
	            case'+':result=first+second;
	            break;
	           case'-':result=first-second;
	         break;
	            case'*':result=first*second;
	            break;
	            case'/':result=first/second;
	            break;
	            case'%':result=first+second;
	            break;
	            default:System.out.println("error");
	        }
	        System.out.println(first+"\n"+second+"\n"+result);

	    }
	}
