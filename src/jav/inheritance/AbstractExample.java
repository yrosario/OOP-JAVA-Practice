package jav.inheritance;

abstract class Bike{
	
	Bike(){
		System.out.println("bike is created");
	}
	
	abstract void stop();
	
	void changeGear() {
		System.out.println("gear changed");
	}
	
}

abstract class Honda extends Bike{
	
	abstract void run();
	abstract void stop();
}

class Hello extends Honda{
	
	void run() {
		System.out.println("running safely");
	}
	
	void stop() {
		System.out.println("stopping safely");
	}
}

public class AbstractExample {
	
	public static void main(String args[]) {
		
		Honda k = new Hello();
		
		k.run();
		k.stop();
		k.changeGear();
	}

}
