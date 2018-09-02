package LeeCode;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toString();// 用nextLine（）可以读取一整行，包括了空格，next（）却不能读取空格
		String arr[] = str.split(" ");// 拆分字符串成字符串数组
		int a[] = new int[arr.length];
		int count=0;
		int sumCount=1;
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.valueOf(arr[0]);
			if(a[i]==0) 
				{
				count++;
				sumCount=sumCount*2;
				}
		}
		
		ArrayList<String> list=new ArrayList<String>();
		int[][] martin=new int[sumCount][9];
		for (int i = 0; i < sumCount; i++) {
			
			for(int j = 0; j < 9; j++)
			{
				martin[i][j]=1;
			}
			
		}
        for (int i = 0; i < sumCount; i++) {
			
			for(int j = 0; j < 9; j++)
			{
				if(a[j]==0)
				{
					
				}
			}
			
		}
		
		
		System.out.println("0123456789" );
		  
		

	}
}
