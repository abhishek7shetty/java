package com.alkeon.Born;

class Animalso{
	public void eat() {
		System.out.println("I can eat");
	}
    public void sleep() {
		System.out.println("I can sleep");
	}
}

class Dog extends Animalso{
	public void bark() {
		System.out.println("I can bark");
	}}

public class Main{
	public static void main(String[]args) {
		Dog obj=new Dog();
		obj.eat();
        obj.sleep();
		obj.bark();
	
	}


}