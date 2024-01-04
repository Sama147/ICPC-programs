package all_files;
import java.util.Scanner;
	

public class football_dangerous_or_not 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
	    boolean checker = isDangerous(input);
	    if (checker) 
	    {
	       System.out.println("YES");
	    } 
	    else 
	    {
	       System.out.println("NO");
	    }
	    scanner.close();
	    }

public static boolean isDangerous(String input) 
{
	int counter = 1;
	char prev = input.charAt(0);
	for (int i = 1; i < input.length(); i++) 
	{
		char current = input.charAt(i);
	    if (current == prev) 
	    {
	       counter++;
	    if (counter == 7) 
	    {
	       return true;
	    }
	    }
	    else 
	    {
	    	counter = 1;
	        prev = current;
	    }
	    }
	        return false;
	    }
}


