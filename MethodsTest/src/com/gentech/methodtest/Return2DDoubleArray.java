package com.gentech.methodtest;
class Retrun2D{
	static double[][] show(double arr[][]){
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		return arr;
	}
}
public class Return2DDoubleArray {

	public static void main(String[] args) {
		Retrun2D r=new Retrun2D();
		double arr[][]= {{10.2,12.2,14.3,18.2},{18.2,19.3,16.8,17.4}};
		r.show(arr);

	}

}
