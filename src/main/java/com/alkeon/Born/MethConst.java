package com.alkeon.Born;
class Tester{
	Tester (){
		System.out.println("constructor invoked");
	}
		void init() {
	System.out.println("method envolved");
}}
public class MethConst {

	public static void main(String[] args) {
		Tester test=new Tester();
		test.init();
	}

}
