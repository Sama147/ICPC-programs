package all_files;
import java.util.Scanner;

public class boy_or_girl 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
	    String name = scanner.next();
	    int distinctCharacters = countDistinctCharacters(name);

	 if (distinctCharacters % 2 == 0) 
	 {
		 System.out.println("CHAT WITH HER!");
	 } 
	 else 
	 {
		 System.out.println("IGNORE HIM!");
	 }
	 }

	 private static int countDistinctCharacters(String name) 
	 {
		 boolean[] visited = new boolean[26]; // Assuming only lowercase English letters
	     int distinctCharacters = 0;

	     for (int i = 0; i < name.length(); i++) 
	     {
	        int index = name.charAt(i) - 'a'; // Convert character to index (0-25)
	        if (!visited[index]) 
	        {
	           visited[index] = true;
	           distinctCharacters++;
	        }
	        }
	        return distinctCharacters;
	    }
	
}
