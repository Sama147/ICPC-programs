package all_files;


import java.util.Scanner;

public class concatination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();

        System.out.println(s1.length() + " " + s2.length());
        System.out.println(s1 + " " + s2);
    }
}


