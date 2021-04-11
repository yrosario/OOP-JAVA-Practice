package jav.inheritance;

class Animal{
	
	public void eat() {
		System.out.println("Eating.....");
	}
}

class Dog extends Animal{
	
	void bark() {
		System.out.println("barking.....");
	}
}

class BabyDog extends Dog{
	
	void weep() {
		System.out.println("Weeping......");
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		
		BabyDog babyD = new BabyDog();
		
		babyD.eat();
		babyD.bark();
		babyD.weep();

	}

}
