package all_files;
import java.util.Scanner;

public class meduim_num 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);	        
		int num_of_values = scanner.nextInt();
		int[][] array = new int[num_of_values][3];
		
		for (int x = 0 ; x < num_of_values; x++)
		{
			for (int y = 0 ; y < 3; y++)
			{
				array[x][y] = scanner.nextInt();
			}
		}
		for (int i = 0 ; i < array.length; i++)
		{
			if ( ( (array[i][0] > array[i][1]) && (array[i][0] < array[i][2]) ) ||  (( (array[i][0] < array[i][1]) && (array[i][0] > array[i][2]) )))
				System.out.println(array[i][0]);
			else if ( ( (array[i][1] > array[i][0]) && (array[i][1] < array[i][2]) ) ||  (( (array[i][1] < array[i][0]) && (array[i][1] > array[i][2]) )))
				System.out.println(array[i][1]); 
			else
				System.out.println(array[i][2]); 
				
		}			
	}
}

