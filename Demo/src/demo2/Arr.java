package demo2;

import java.util.Arrays;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int[] arr1= {2,5,7,8};
		
		//System.out.println(arr1[1]);
		
		String[] arr2= {"a","5","v","9"};
		
		
		//System.out.println(arr2[3]);
		
		int[] arr3=new int[8];
		
		arr3[0]=4;
		arr3[2]=9;
		
		System.out.println(arr3[0]);
		
		System.out.println(arr3[1]);
		
		
		System.out.println(arr3[2]);  */
		
		
		int[] arr3=new int[8];
		
		//arr3.length;
		
		//System.out.println(arr3.length);
		arr3[0]=4;
		arr3[1]=5;
		arr3[2]=8;
		arr3[4]=9;
		arr3[5]=10;
		
		for(int i=0;i<arr3.length;i++)
		{
			
			
			
			
			///System.out.println(arr3[i]);    ///while and do while
			
		
		}
		/*
		 * int i=0; //System.out.println(arr3.length); while (arr3.length >i) {
		 * System.out.println(arr3[i]);
		 * 
		 * i++; //1 2 3
		 * 
		 * }
		 */
		
		int k=0;
		do
		{
			System.out.println(arr3[k]);
			k++;
		}while(arr3.length >k);
		
		
		
	}

}
