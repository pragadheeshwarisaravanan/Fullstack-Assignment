package com.code1;

public class rectangle {
     float width,height;
     
     float area,perimeter;

   
     void calc(float width,float height){
      area = width*height;
      
      perimeter=2*(width+height);
}
void display() {
	System.out.println("area of rectangle : " + area);
	System.out.println("perimeter of rectangle : " + perimeter);
	
}
public static void main(String[] args) {
	rectangle rec1 = new rectangle();
	rec1.calc(10,20);
	rec1.display();
}
}