package interviews;

import java.util.Scanner;

public class Zeroone {

	public static void main(String[] args) 
	{
		Scanner scr= new Scanner(System.in);
		int num = scr.nextInt();
		int pow[]= new int[num];
		int val[]= new int[num];
	    int i,j,count,x,ten;
	        for(i=0; i<num; pow[i++]=0);
	        count=0;
	        for(ten=1,x=1; x<num; x++)
	        {
	            val[x]=ten;
	            for(j=0; j<num; j++)
	            	if(pow[j]!=0 && pow[(j+ten)%num]==0 && pow[j]!=x)
	            		pow[(j+ten)%num]=x;
	            if(pow[ten]==0)pow[ten]=x;
	            ten=(10*ten)%num;
	            if(pow[0]!=0)break;
	        }

	        x=num;
	        System.out.println(x);
	        if(pow[0]!=0)
	        {
	            while(x!=0)
	            {
	                while(--count>pow[x%num]-1)
	                	System.out.println("0");
	                count=pow[x%num]-1;
	                System.out.println("1");
	                x=(num+x-val[pow[x%num]])%num;
	            }
	            while(count-->0)
	            	System.out.println("0");
	        }
	        System.out.println("\n");
	    scr.close();
	}
}
