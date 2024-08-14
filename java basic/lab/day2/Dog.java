package com.code1;

public class Dog {
	String name,breed;
	
	Dog(String name, String breed){
		this.name=name;
		this.breed=breed;
		
	}
	void display() {
		System.out.println("name : " + name);
		System.out.println("breed : " + breed);
		
	}
	void update() {
		this.name=name;
		this.breed=breed;
	}

	public static void main(String[] args) {
		Dog dog1 = new Dog("blacky"," Labrador");
		dog1.display();
		
		Dog dog2 = new Dog("rosy","Pomerian");

		dog2.update();
		
	}

}
