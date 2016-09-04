package day13abstractclasses;

public abstract class Animal {

	private int age;
		
	public Animal(int age) {
		this.age = age;
		System.out.println("An Animal has been created");
	}

	public int getAge() {
		return age;
	}
	
	public abstract void eat();
	
	public void sleep() {
		System.out.println("An Animal is sleeping");
	}
	
	public static void main(String[] args) {
		Animal a = new Dog(10);
		// a.ruff();  Causes complier error
		@SuppressWarnings("unused")
		Animal aa = (Dog) a;
		// aa.ruff(); Causes compiler error
		((Dog) a).ruff();

		Dog d =  (Dog) a;
		d.ruff();
		
		Dog doggy = new Dog(5);
		Animal animal = (Animal) doggy;
		// animal.ruff(); Compiler error
		animal.sleep();   // It will call dog.sleep() // Reason: Overridden methods were preserved over casting

		if (doggy instanceof Animal) {
			System.out.println("Yes. Dog is a instance of Animal also");
		}
	}
}
