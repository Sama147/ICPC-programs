package all_files;


import java.util.Scanner;

public class candies 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int num_of_cases = scanner.nextInt();
		int even_sum = 0, odd_sum = 0;
		
		for (int i = 0 ; i < num_of_cases; i++)
		{
			int num_of_bags = scanner.nextInt();
			int[] An_Array = new int [num_of_bags];
			for (int j = 0 ; j < num_of_bags; j++)
			{
				An_Array[j] = scanner.nextInt();
				if (An_Array[j] % 2 == 0 || An_Array[j] == 0 )
				{
					even_sum += An_Array[j];
				}
				else
					odd_sum += An_Array[j];
			}
			if(even_sum > odd_sum)
			    System.out.println("YES");
		    else
			    System.out.println("NO");
			even_sum = 0;
			odd_sum = 0;
		}
		
		
	}
}


