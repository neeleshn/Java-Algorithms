package trees;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
	public static void main(String args[] ) throws Exception 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
        Scanner scr= new Scanner(System.in);
        int nrows = scr.nextInt();
        System.out.println(nrows);
        int ncolumns = scr.nextInt();
        System.out.println(ncolumns);
                char[][] a = new char[nrows][ncolumns];
        for(int i=0;i<nrows;i++)
        {            
            String inp = scr.next(); 
          //  System.out.println(i+" - >" + inp + "-- ");
             a[i]= inp.toCharArray();
        }
        int counter=0;
        // System.out.print(4);
        // for(int i=0;i<nrows;i++)
        //   for(int j=0;j<ncolumns;j++)
         //       System.out.println(a[i][j]);
        for(int i=0;i<nrows;i++)
        {
            for(int j=0; j<ncolumns; j++)
            {
                if(a[i][j] == 'Y')
                {
                	
                    a=dfs(a,i,j,nrows,ncolumns);
                    counter++;
                }
            }
        }
        
        BigInteger sum= BigInteger.valueOf(0);
        for(int i=1;i<=counter;i++)
        {
            if(i%2==0)
                sum=(fact(counter).divide(fact(i)).divide(fact(counter-i))).add(sum);
        }
        System.out.print(sum);
        scr.close();
    }
    
    static BigInteger fact(int counter)
    {
        BigInteger fact= BigInteger.valueOf(1);
        if(counter==0)
            fact=BigInteger.valueOf(1);
        else
            for(int i=1;i<=counter;i++)
            {
                fact=fact.multiply(BigInteger.valueOf(i));
            }        
        return fact;    
    }
    
    static char[][] dfs(char[][] a, int i, int j, int nrows, int ncolumns)
    {
        a[i][j]='N';
        //System.out.println("i = "+i);
        //System.out.println("j = "+j);
        if(i>0)
        {
          //  System.out.println("pass1");
            if(a[i-1][j] == 'Y')
                a=dfs(a,i-1,j,nrows,ncolumns);
        }
        if(i<nrows-1)
        {
            //System.out.println("pass2");
            if(a[i+1][j] == 'Y')
                a=dfs(a,i+1,j,nrows,ncolumns);
           // System.out.println("pass22");
        }
        if(j>0)
        {
            //System.out.println("pass3");
            if(a[i][j-1] == 'Y')
                a=dfs(a,i,j-1,nrows,ncolumns);
        }
        if(j<ncolumns-1)
        {
            //System.out.println("pass4");
            if(a[i][j+1] == 'Y')
                a=dfs(a,i,j+1,nrows,ncolumns);
        }
        return a;
    }
}
