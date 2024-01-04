package all_files;
import java.util.Scanner;

public class swap_max_with_min 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
	    int num_cases = scanner.nextInt();

	    int[] nums_array = new int[num_cases];
	    for (int i = 0; i < num_cases; i++) 
	    {
	    	int num = scanner.nextInt();
	        nums_array[i] = num;
	    }

	    int max = nums_array[0];
	    int min = nums_array[0];
	    int index_value_max = 0;
	    int index_value_min = 0;

	    for (int j = 1; j < nums_array.length; j++) 
	    {
	    	if (max < nums_array[j]) 
	    	{
	    		max = nums_array[j];
	            index_value_max = j;
	        }
	        if (min > nums_array[j]) 
	        {
	           min = nums_array[j];
	           index_value_min = j;
	        }
	    }

	    int temp = nums_array[index_value_max];
	    nums_array[index_value_max] = nums_array[index_value_min];
	    nums_array[index_value_min] = temp;

	    for (int z = 0; z < nums_array.length; z++) 
	    {
	        System.out.print(nums_array[z] + " ");
	    }
	 }

}
