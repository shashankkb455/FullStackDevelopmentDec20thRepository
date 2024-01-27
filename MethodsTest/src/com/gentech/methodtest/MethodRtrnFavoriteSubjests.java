package com.gentech.methodtest;
class FavrtSubjects{
	String showfvrtsubjects(String name) {
		return name;
	}
}
public class MethodRtrnFavoriteSubjests {

	public static void main(String[] args) {
		FavrtSubjects fvrt=new FavrtSubjects();
		String s1=fvrt.showfvrtsubjects("physics");
		String s2=fvrt.showfvrtsubjects("maths");
		String s3=fvrt.showfvrtsubjects("chemistry");
		System.out.println("favrt subject is "+s1);
		System.out.println("favrt subject is "+s2);
		System.out.println("favrt subject is "+s3);

	}

}
