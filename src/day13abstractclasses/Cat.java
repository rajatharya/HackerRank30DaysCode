package day13abstractclasses;

public class Cat extends Animal {

	public Cat(int age) {
		super(age);
		System.out.println("A Cat has been created");
	}
	
	public void eat() {
		System.out.println("A Cat is eating");
	}
	
	public void meow() {
		System.out.println("A Cat says Meow");
	}
	
	public void prance() {
		System.out.println("A Cat is prancing");
	}
}
