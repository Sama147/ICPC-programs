package all_files;

import java.util.Scanner;

public class correct_yes 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t-- > 0) 
        {
            String s = scanner.nextLine();

            if (s.equalsIgnoreCase("YES")) 
            {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

