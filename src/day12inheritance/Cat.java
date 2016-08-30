package day12inheritance;

public class Cat extends Animal {

	public Cat(int age) {
		super(age);
		System.out.println("A cat has been created");
	}
	
	public void meow() {
		System.out.println("The cat meows !!!");
	}

	public void prance() {
		System.out.println("The cat is prancing");
	}
}
