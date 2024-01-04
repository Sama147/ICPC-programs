package all_files;
import java.util.Scanner;

public class check_password 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
        int x=scan.nextInt();
        while (x != 1999)
        {
            System.out.println("Wrong");
             x=scan.nextInt();
        }
        System.out.println("Correct");
        
	}
}
