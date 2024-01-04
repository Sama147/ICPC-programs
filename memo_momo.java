package all_files;
import java.util.Scanner;

public class memo_momo
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
        long x1,x2,x3;
         x1=scan.nextLong();
         x2=scan.nextLong();
         x3=scan.nextLong();
 
        if (x1%x3 == 0)
        {
        	if (x2%x3 == 0)
        	{
        		System.out.print("Both");
        	}
        	else
        	{
        		System.out.print("Memo");
        	}
        }
        else if (x2%x3 == 0)
        {
            	System.out.print("Momo");
        }
        else
        {
        	System.out.print("No One");
        }
        
	}
}


