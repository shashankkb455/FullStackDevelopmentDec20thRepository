package com.gentech.methodtest;
class Sum2ndHalf{
	static int showresult(int arr[]) {
		int sum=0;
		for(int i=arr.length/2;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
}
public class Sum2ndHalfIntegerArray {

	public static void main(String[] args) {
		Sum2ndHalf s=new Sum2ndHalf();
		int arr[]= {10,20,30,40,50,60};
		System.out.println("sum of the 2nd half element is "+s.showresult(arr));
	}

}
