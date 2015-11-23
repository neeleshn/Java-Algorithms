package fraction;

import java.math.BigDecimal;
import java.util.HashMap;

public class Fraction {

	public static void main(String[] args) {
		int n = 7; 
		int d = -12;
		int x = n;
		int y = d;
		int z = x%y;		
		int k = 1;
		int flag=0;
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		while(true)
		{
			if(h.containsKey(z))
			{
				flag=h.get(z);
				break;
			}
			else h.put(z, k);
			x = z*10;			
			z=x%y;
			k++;
			if(z==0)
			{
				flag = 0;
				break;
			}
		}
		BigDecimal n1 = new BigDecimal(n);
		BigDecimal d1 = new BigDecimal(d);
		BigDecimal b = n1.divide(d1, 20, 1);
		String s= ""+b;
		System.out.println("s = "+s);
		if(flag==0)
		{
			if (n%d==0)
			{
			    String s4=Integer.toString(n/d);
			    System.out.println(s4);
			}
			else
			{
			    double d5= (double) n/d;
			    String s5 = Double.toString(d5);
			    System.out.println(s5);
			}
		}
		else
		{
			System.out.println(s);
			System.out.println("k = "+k);
			String[] s1= s.split("\\.");
			System.out.println(s1[0]);
			System.out.println(s1[1]);
			char[] c = s1[1].toCharArray();
			String os="";
			if(n>0 && d>0)
			os=""+n/d+".";
			else
			os="-"+n/d+".";
			System.out.println("os . = "+os);
			if(k>c.length)
				k=c.length;
			System.out.println("c length = "+c.length);
			for (int i=0;i<k;i++)
			{
				if(i==flag-1)
					os=os+"("+c[i];
				else os=os+c[i];
			}
			os=os+")";
			System.out.println(os);
		}
	}
}
