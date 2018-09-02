package LeeCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {


	public static void main(String[] args) {  
       
        Scanner sc = new Scanner(System.in);  
         int num=Integer.parseInt( sc.nextLine());      		 
        	//	System.out.println(num);
        String str = sc.nextLine().toString();//用nextLine（）可以读取一整行，包括了空格，next（）却不能读取空格  
        String arr[] = str.split(" ");//拆分字符串成字符串数组  
        int a[] = new int[arr.length];  
        int sum=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(a.length==0) System.out.println(0);
        else {
        	for(int j = 0; j < a.length; j++)  
            {  
                if(list.size()==0)
                {
                	list.add(a[j]);
                }else if(a[j]>list.get(list.size()-1)){
                	list.add(a[j]);
                }               	
                
            
            } 
        //	Collections.sort(list,null);
            
        }
        
        for (Integer integer : list) {
        	sum=sum+integer;
		}
        System.out.println(sum);
     
        
	}

}
