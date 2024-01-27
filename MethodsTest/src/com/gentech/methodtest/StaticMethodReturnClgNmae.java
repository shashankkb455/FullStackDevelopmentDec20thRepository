package com.gentech.methodtest;
class Student{
	static String CollegeName(String name) {
		return name;
	}
}
public class StaticMethodReturnClgNmae {

	public static void main(String[] args) {
		String s=Student.CollegeName("Rajeev Institute of Technology");
		System.out.println("college name is "+ s);

	}

}
