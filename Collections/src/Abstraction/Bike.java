package Abstraction;

abstract class Bike {
	   Bike(){
		   System.out.println("bike is created");
		   }
	abstract void run();
	void changeGear(){
		System.out.println("gear changed");
		} 
}

class Honda4 extends Bike {
	void run() {
		System.out.println("running safely..");
	}

	public static void main(String args[]) {
		Bike obj = new Honda4();

	}
}