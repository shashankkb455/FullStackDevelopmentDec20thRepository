package com.gentech.methodtest;
class LongArray{
	static int viewlongarray(long arr[][]) {
		return arr.length*arr[0].length;
	}
}
public class LengthofLond2DArray {

	public static void main(String[] args) {
		long arr[][]= {{10,20,30},{40,50,60}};
		System.out.println(LongArray.viewlongarray(arr));

	}

}
