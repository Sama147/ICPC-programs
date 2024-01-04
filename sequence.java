package all_files;

import java.util.Scanner;

public class sequence 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);
		int a, b, sum=0;
		a=s.nextInt();
		b=s.nextInt();
		
		while ((a > 0) && (b > 0))
		{
		    int start , end;
		    
			if (a < b)
			{
			    start =a;
			    end = b;
			}
			else
			{
			    start =b;
			    end = a;
			}
				
			for (int i=start; i<=end ; i++)
			{
					System.out.print(i + " ");
					sum += i;
			}
			
			System.out.print(" sum =" + sum +"\n");
            a=s.nextInt();
		    b=s.nextInt();
		    sum=0;
		}

		
	}

}

