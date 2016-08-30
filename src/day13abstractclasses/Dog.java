package day13abstractclasses;

public class Dog extends Animal {

	public Dog(int age) {
		super(age);
		System.out.println("A dog has been created");
	}

	@Override
	public void eat() {
		System.out.println("A dog is eating");
	}
	
	@Override
	public void sleep() {
		System.out.println("A dog is sleeping");
	}
	
	public void ruff() {
		System.out.println("A dog says ruff");
	}
	
	public void  run() {
		System.out.println("A dog is running");
	}

}
