import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class frequency {

	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner file1 = new Scanner(new File("test.txt"));
		HashMap<String, Integer> h= new HashMap<String, Integer>();
		while(file1.hasNext())
		{
			String s= file1.next();
			if(h.containsKey(s))
				h.put(s, h.get(s)+1);
			else h.put(s, 1);			
		}
		Iterator<String> i = h.keySet().iterator();
		int count=0;
		String word=null;
		while(i.hasNext())
		{
			String w=i.next();
			if(h.get(w)>count)
			{
				count=h.get(w);
				word=w;
			}
		}
		System.out.println("highest used word is : "+word);
		System.out.println("and count is : "+count);
		file1.close();
	}
}
