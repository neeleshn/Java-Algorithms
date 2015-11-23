
public class revstr {
	public static void main(String[] args) 
	{
		String a = "life is very beautiful";
		int w[]=new int[10];
		char[] b= a.toCharArray();
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i]);
		}
		System.out.println();
		for(int i=0, j=b.length-1 ; i<j ; i++, j--)
		{
			char temp = b[i];
			b[i]= b[j];
			b[j]= temp;			
		}	
		
		
		int m=0;
		w[0]=-1;		
		for(int p=0; p<b.length; p++)
		{
			if(b[p]==' ')
			{
				m++;
				w[m]=p;
			}
		}
		m++;
		w[m]=b.length;
		
		
		for(int i=1; i<w.length && w[i]!=0; i++)
		{
			for(int j=w[i-1]+1, k=w[i]-1 ; j<k ; j++, k--)
			{
				char temp = b[j];
				b[j]= b[k];
				b[k]= temp;				
			}
		}
		System.out.println();
		for(int p=0; p<b.length; p++)
		{
			System.out.print(b[p]);
		}
	}
}
