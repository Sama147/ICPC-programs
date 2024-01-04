package all_files;
import java.util.Scanner;
public class Dvision_OneToFour
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
        Long x=scan.nextLong();
        for (int i = 0; i<x ; i++)
        {
            Long y=scan.nextLong();
        	if (y<=1399)
        	{
        		System.out.println("Division 4");
        	}
        	else if (y<=1599)
        	{
        		System.out.println("Division 3");
        	}
        	else if ( y<= 1899)
        	{
        		System.out.println("Division 2");
        	}
        	else 
        	{
        		System.out.println("Division 1");
        	}

        	
        }
	}
}

