package LeeCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] t = new int[n];
        int sum=0;
        for(int i = 0; i < n; i++){          
               
                 a[i]= sc.nextInt();;
           
        } 
        for(int i = 0; i < n; i++){          
               
              t[i]= sc.nextInt();
              if(t[i]==1)
              {
            	  sum=sum+a[i];
              }
           
        } 
       ArrayList<Integer> up=new ArrayList<Integer> ();
       int temp=0;
       for(int i = 0; i < n; i++) {
    	   temp=0;
    	   
    	   for(int j = 0; j < k; j++)
    	   {
    		   if(i+k>=n)
    		   {
    			   
    		   }
    		   else {
    			   if(t[i+j]==0)
        		   {
        			   temp=temp+ a[i+j];
        			   System.out.println(""+i+"   "+a[i+j]);
        		   } 
    		   }
    	   }
    	   up.add(temp);
       }
       Collections.sort(up);
       Collections.reverse(up);
       System.out.println(up.toString());
       System.out.println(sum+up.get(0));  
    }
}