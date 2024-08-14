package com.project;
class C{
	C(){
		this(5);
		System.out.println("C");
	}
	C(int a){
		super();
		System.out.println("C 1");
	}
}
class D extends C{
	D(){
		super(5);
		System.out.println("D");
	}
	D(int a){
		System.out.println("D 1");
	}
}

public class invocation {

	public static void main(String[] args) {
		D d = new D(5);
	}

}
