package all_files;
import java.util.Scanner;

public class Hulk_IgnoreOrNot 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		int num = scanner.nextInt();
			
		if(num == 1)
			System.out.print("I hate it");
		else
		{
			for (int i = 1 ; i <= num; i++)
			{
				if(i == 1)
					System.out.print("I hate that" );
				else if(i == num)
				{
					if(i % 2 == 0)
						System.out.print(" I love it");
					else if (i % 2 != 0)
						System.out.print(" I hate it" );
				}
				else if(i % 2 == 0)
				{
					System.out.print(" I love that" );
				}
				else if (i % 2 != 0)
				{
					System.out.print(" I hate that " );
				}
						
			}
						
		}
				
				
	}	

}



