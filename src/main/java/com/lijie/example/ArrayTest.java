package com.lijie.example;


public class ArrayTest {

	public static void main(String[] args) {
          int []a ={1,2,3,4,5,6,7};
		System.arraycopy(a, 4, a, 0, 3);
		StringBuilder sb =new  StringBuilder();
		for(int i =0;i<a.length;i++){
			sb.append(a[i]);
		}
		System.out.println(sb.toString());
	}

}
