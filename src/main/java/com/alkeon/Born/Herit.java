package com.alkeon.Born;
class Animals{
	public void eat() {
		System.out.println("I can eat");
	}
	public void sleep() {
		System.out.println("I can sleep");
	}

class Dog extends Animals{
	public void bark() {
		System.out.println("I can bark");
	}
}

	public void main(String[]args) {
		Dog d1=new Dog();
		d1.eat();
		d1.sleep();
		d1.bark();
		

	}

}

