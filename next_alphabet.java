package all_files;
import java.util.Scanner;

public class next_alphabet 
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		char entered_letter = scanner.next().charAt(0);
		int letter = entered_letter;
		char next_letter = (char) ((char) letter + 1);
		if ( entered_letter != 'z')
			System.out.println(next_letter);
	}  
}


