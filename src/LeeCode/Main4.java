package LeeCode;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {	

	 Scanner sc = new Scanner(System.in);  
    		 
    	//	System.out.println(num);
    String str = sc.nextLine().toString();//��nextLine�������Զ�ȡһ���У������˿ո�next����ȴ���ܶ�ȡ�ո�  
    String arr[] = str.split(" ");//����ַ������ַ�������  
   // int a[] = new int[arr.length];  
    int n=Integer.valueOf(arr[0]);  
    int m=Integer.valueOf(arr[1]);  
    
    
    String str2 = sc.nextLine().toString();//��nextLine�������Զ�ȡһ���У������˿ո�next����ȴ���ܶ�ȡ�ո�  
    String arr2[] = str.split(" ");//����ַ������ַ�������  
    int[] sorc = new int[arr2.length]; 
    for (int i = 0; i < sorc.length; i++) {
    	sorc[i]=Integer.valueOf(arr2[i]);  
	}
    int sum=0;
    ArrayList<Integer> list=new ArrayList<Integer>();

    
	}
}
