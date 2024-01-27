package com.gentech.methodtest;
class Boolean{
	 void show(boolean arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
}
public class BooleanArray {

	public static void main(String[] args) {
		Boolean b=new Boolean();
		boolean arr[]= {true,false};
		b.show(arr);

	}

}
