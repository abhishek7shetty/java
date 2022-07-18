package com.alkeon.Born;
class Person{
	String name;
	int id;
	Person(String name,int id){
		this.id=id;
		this.name=name;
	}
}
class Employee extends Person{
	float salary;
	Employee(int id, String name ,float salary){
		super(name,id);
		this.salary=salary;
		
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}
public class Sou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee obj=new Employee(400,"abhi",50055f) ;
obj.display();
	}

}
