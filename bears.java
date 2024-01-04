package all_files;
import java.util.Scanner;

public class bears 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);
		int a,b,c=0;
		a=s.nextInt();
		b=s.nextInt();
		do 
		{
	        a*=3;
			b*=2;
			c++;
		}
		    while (a<=b);
		System.out.println(c);
	}
		
}


