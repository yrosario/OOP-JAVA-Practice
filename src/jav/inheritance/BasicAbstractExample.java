package jav.inheritance;


abstract class AbstractDemo{
	
	String name = "abc";
	
	AbstractDemo(){
		System.out.println("inside the abstract class constructor...");
	}
	
	public void myMethod() {
		System.out.println("hello");
	}
	
	abstract public void anotherMethod();

}

public class BasicAbstractExample extends AbstractDemo {
	
	BasicAbstractExample(){
		System.out.println("Inside the child class");
	}
	
	public void anotherMethod() {
		System.out.println("Abstract method");
	}

	public static void main(String[] args) {
		
		AbstractDemo obj = new BasicAbstractExample();
		
		obj.myMethod();
		obj.anotherMethod();

	}

}
