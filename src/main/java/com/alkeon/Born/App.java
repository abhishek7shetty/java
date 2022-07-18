package com.alkeon.Born;

public class App 
{
    public static void main( String[] args )
    {
      int nums[]= {10,20,30,40,5};
      int sum=0;
      for(int x:nums) {
    	  sum=sum+x;
    	  System.out.println("value is :"+x);
    	  
      }
      System.out.println("sum value is :"+sum);
    }
}
