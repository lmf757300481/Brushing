package LeeCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {


	public static void main(String[] args) {  
       
        Scanner sc = new Scanner(System.in);  
         int num=Integer.parseInt( sc.nextLine());      		 
        	//	System.out.println(num);
        String str = sc.nextLine().toString();//��nextLine�������Զ�ȡһ���У������˿ո�next����ȴ���ܶ�ȡ�ո�  
        String arr[] = str.split(" ");//����ַ������ַ�������  
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
