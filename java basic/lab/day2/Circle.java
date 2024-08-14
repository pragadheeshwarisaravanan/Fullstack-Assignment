package com.code1;

public class Circle {
	float radius;
	
	Circle(float radius){
		float area = (float)(Math.PI*(radius*radius));
		
		float perimeter=(float)(2*Math.PI*radius);
	
		System.out.println("area of Circle : " + area);
		System.out.println("perimeter of Circle : " + perimeter);
		
	}
	public static void main(String[] args) {
		Circle circle1 = new Circle(5);
	}
	
		
}