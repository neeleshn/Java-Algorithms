package trees;
import java.math.BigInteger;
import java.util.*;
public class Group1 {

	public static void main(String[] args) 
	{
		String[] row = null;
		row[0]= "hello";
		row[1]= "bye";
		char[][] b = new char[2][2];
		for(int i=0;i<2;i++)
		{
			b[i] = row[i].toCharArray();
		}
		char[][] a = new char[3][3];
		a[0][0]='1';
		a[0][1]='1';
		a[0][2]='1';
		a[1][0]='0';
		a[1][1]='0';
		a[1][2]='0';
		a[2][0]='1';
		a[2][1]='0';
		a[2][2]='1';
		int counter=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]=='1')
				{
					a=dfs(a,i,j);
					counter++;
				}
			}			
		}
		System.out.println(counter);
		BigInteger sum = BigInteger.valueOf(0);
		for(int i=0;i<counter;i++)
		{
			if(i%2==0)
			sum=(fact(counter).divide(fact(i)).divide(fact(counter-i))).add(sum);
		}
		System.out.println(sum);
	}

	static BigInteger fact(int counter) 
	{
		BigInteger fact= BigInteger.valueOf(1);
		for(int i=1; i<=counter;i++)
		{
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}

	static char[][] dfs(char[][] a, int i, int j) 
	{
		a[i][j]='0';
		if(i>0)
		{
			if(a[i-1][j] == '1')
			{
				a=dfs(a,i-1,j);
			}
		}
		if(i<2)
		{
			if(a[i+1][j] == '1')
			{
				a=dfs(a,i+1,j);
			}
		}
		if(j>0)
		{
			if(a[i][j-1] == '1')
			{
				a=dfs(a,i,j-1);
			}
		}
		if(j<2)
		{
			if(a[i][j+1] == '1')
			{
				a=dfs(a,i,j+1);
			}
		}
		return a;
	}
}
