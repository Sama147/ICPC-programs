package all_files;

import java.util.Scanner;

import java.util.Scanner;

public class Atilla_problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String S = scanner.next();

            int maxChar = 0;
            for (char c : S.toCharArray()) {
                if (c > maxChar) {
                    maxChar = c;
                }
            }

            int alphabetSize = maxChar - 'a' + 1;
            System.out.println(alphabetSize);
        }
    }
}




