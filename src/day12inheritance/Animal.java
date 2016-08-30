package day12inheritance;

public class Animal {

	int age;
	
	public Animal(int age) {
		this.age = age;
		System.out.println("Animal has been created");
	}
	
	public void eat() {
		System.out.println("Animal is eating");
	}
	
	public static void main(String[] args) {
		Animal a = new Animal(5);
		Dog d = new Dog();
		Cat c = new Cat(6);
		d.ruff();
		c.meow();
		a.eat();
		d.eat();
		c.eat();
		d.run();
		c.prance();
	}

}
