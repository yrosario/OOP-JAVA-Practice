package jav.inheritance;

class Bank{
	float interestRate = 3.0f;
	
	float getRateOfInterest() {
		return interestRate;
	}
}

class SBI extends Bank{
	float interestRate = 5.0f;
	
	float getRateOfInterest() {
		return interestRate;
	}
}

class AXIS extends Bank{
	float interestRate = 7.0f;
	
	float getRateOfInterest() {
		return interestRate;
	}
}

public class RuntimePolymorphism {

	public static void main(String[] args) {
		
		Bank b;
		
		b = new SBI();
		System.out.println("SBI rate of interest rate: " + b.getRateOfInterest());
		
		b = new AXIS();
		System.out.println("AXIS rate of interest rate: " + b.getRateOfInterest());
		
		b = new Bank();
		System.out.println("Bank rate of interest rate: " + b.getRateOfInterest());

	}

}
