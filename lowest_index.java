package all_files;
import java.util.Scanner;

public class lowest_index 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int num_of_values = scanner.nextInt();
		
		int[] nums = new int[num_of_values];
		int min = Integer.MAX_VALUE;
		int smallest_index = -1;
		
		for (int i = 0 ; i < num_of_values ; i++)
		{
			int num = scanner.nextInt();
			nums[i]= num;
			if (nums[i] < min )
			{
				min = nums[i];
				smallest_index = i + 1;
			}
			
		}
		System.out.println(min + " " + smallest_index );
		
	}
}

