package all_files;
import java.util.Scanner;

public class pyramid 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
        int x = scan.nextInt();
        for (int i = 0; i<x ; i++)
        {
        	for (int j = 0;  j<x  ; j++)
        	{
        		if (i>=j)
        		{
        			System.out.print("*");
        		}
        		
        	}
        	System.out.print("\n");
        }
	}
}
