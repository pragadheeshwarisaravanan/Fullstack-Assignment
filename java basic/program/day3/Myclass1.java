package com.project;
//single inheritance 

class TwoWheelers extends Vehicle{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}
class Bikes extends TwoWheeler{
	void brandName() {
		System.out.println("Brand Name is Honda");
		
	}
}



public class Myclass1 {
	public static void main(String[] args) {
		Bikes bike = new Bikes();
		
		bike.noOfWheels();
		bike.brandName();
	}

}
