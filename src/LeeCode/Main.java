package LeeCode;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {  
       
        Scanner sc = new Scanner(System.in);  
         int num=Integer.parseInt( sc.nextLine());      		 
        	//	System.out.println(num);
        String str1 = sc.nextLine().toString();//用nextLine（）可以读取一整行，包括了空格，next（）却不能读取空格  
        char[] chars1=  str1.toCharArray();
        String str2 = sc.nextLine().toString();//用nextLine（）可以读取一整行，包括了空格，next（）却不能读取空格  
        char[] chars2=  str2.toCharArray();
        String str3 = sc.nextLine().toString();//用nextLine（）可以读取一整行，包括了空格，next（）却不能读取空格  
        char[] chars3=  str2.toCharArray();
        int length1=chars1.length;
        int length2=chars2.length;
        int length3=chars2.length;
        int Count=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int j = 0; j < length1-length2; j++)  
        {  
            for (int i = 0; i < chars2.length; i++) {
				if(chars1[j+i]!=chars2[i])
					{break;}
				else {
					list.add(j);//记录j的位置
					Count++;
				}
			}
        	
        }  
        
        str1.replaceAll(str2, str3);
        System.out.println();
        str1.length()
	}
	
	
	public static int  getCount(char[] chars)
	{
		int length=chars.length;
		if(length==0) return 0;
		
		for(int j = 0; j < length; j++)  
        {  
			char[] firstChars=new char[j+1];
			char[] secondChars=new char[length-j];
			
			System.arraycopy(chars, 0, firstChars, 0, firstChars.length); 
			System.arraycopy(chars, j, firstChars, 0, secondChars.length); 
            
        }  
	}
}