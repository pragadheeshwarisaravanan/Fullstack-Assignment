package com.code1;

public class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		
	}

        public static void main(String[] args) {
		Person person1 = new Person("Dhanuja",21);
		person1.display();
		
		Person person2 = new Person("Dhanu",22);
		person2.display();
		

	}

}
