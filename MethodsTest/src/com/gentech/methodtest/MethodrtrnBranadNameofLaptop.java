package com.gentech.methodtest;
class Laptop{
	String showbrand(String name) {
		return name;
	}
}
public class MethodrtrnBranadNameofLaptop {

	public static void main(String[] args) {
		Laptop lp=new Laptop();
		String s2=lp.showbrand("hp");
		System.out.println("name of the laptop is "+s2);

	}

}
