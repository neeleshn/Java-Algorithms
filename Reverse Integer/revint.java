package reverseint;

import java.util.Scanner;

public class revint {

	public static void main(String[] args) {
		int z=0;
		Scanner scr= new Scanner(System.in);
		do
		{
		System.out.println("enter x value : ");
		z= scr.nextInt();
		int x=z;
		int y=0;
        while(x!=0)
        {
            if(y>=214748365 || y<=-214748365)
            {
            y=0;
            break;
            }
            else
            {
                y=y*10+x%10;
                x=x/10;
            }
        }
        System.out.println(y);
		}while (z!=0);
		scr.close();
	}

}
