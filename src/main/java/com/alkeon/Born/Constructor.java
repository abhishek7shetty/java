package com.alkeon.Born;
class Bike{
	int bikeid;
	String bikename;
	Bike(int id,String name){
		bikeid=id;
		bikename=name;
	}
	void info() {
		System.out.println(" Id-"+bikeid+"\n Name-"+bikename);
	}
}

public class Constructor {

	public static void main(String[] args) {
		Bike b1=new Bike(1024," Hero Honda");
		Bike b2=new Bike(1025,"CBZ");
		b1.info();
		b2.info();
	}

}
