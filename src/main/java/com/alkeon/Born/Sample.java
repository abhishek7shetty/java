package com.alkeon.Born;
class Eac{
	void operator(String s1, String s2){
		String s=(s1+s2);
		System.out.println("Concated string :"+s);
	}
	void operator(int a , int b ) {
		int sum= (a+b);
		System.out.println("sum :"+sum);
	}
}
public class Sample {

	public static void main(String[] args) {
		Eac obj=new Eac();
		obj.operator("Joe", "Root");
		obj.operator(48, 45);

}}
