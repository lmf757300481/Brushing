package LeeCode;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {	

	 Scanner sc = new Scanner(System.in);  
    		 
    	//	System.out.println(num);
    String str = sc.nextLine().toString();//用nextLine（）可以读取一整行，包括了空格，next（）却不能读取空格  
    String arr[] = str.split(" ");//拆分字符串成字符串数组  
   // int a[] = new int[arr.length];  
    int n=Integer.valueOf(arr[0]);  
    int m=Integer.valueOf(arr[1]);  
    
    
    String str2 = sc.nextLine().toString();//用nextLine（）可以读取一整行，包括了空格，next（）却不能读取空格  
    String arr2[] = str.split(" ");//拆分字符串成字符串数组  
    int[] sorc = new int[arr2.length]; 
    for (int i = 0; i < sorc.length; i++) {
    	sorc[i]=Integer.valueOf(arr2[i]);  
	}
    int sum=0;
    ArrayList<Integer> list=new ArrayList<Integer>();

    
	}
}
