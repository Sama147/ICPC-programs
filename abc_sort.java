package all_files;

import java.util.Scanner;

public class abc_sort 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int text_cases = scanner.nextInt();
		
		for (int i = 0 ; i <= text_cases - 1; i++)
		{
			String alpha = scanner.next();
			if (alpha.equals("cab") || alpha.equals("bca"))
				System.out.println("NO");
			else
				System.out.println("YES");
		}
		
	}
}
