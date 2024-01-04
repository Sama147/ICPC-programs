package all_files;
import java.util.Scanner;

public class pangram 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); 
        String inputString = scanner.nextLine(); 
        boolean isPangram = checkPangram(inputString);

        if (isPangram) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }

    public static boolean checkPangram(String inputString) {
        boolean[] visited = new boolean[26];
        int count = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

            if ('A' <= c && c <= 'Z') {
                c = Character.toLowerCase(c);
            }

            if ('a' <= c && c <= 'z') {
                int index = c - 'a';

                if (!visited[index]) {
                    visited[index] = true;
                    count++;
                }
            }

            if (count == 26) {
                return true;
            }
        }

        return false;
    }
}



