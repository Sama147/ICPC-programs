package all_files;
import java.util.Scanner;

public class replace_Egypt
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		
		sentence = sentence.replace("EGYPT"," ");
		
		System.out.println(sentence);
	}
}


