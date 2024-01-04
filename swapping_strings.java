package all_files;

import java.util.Scanner;

public class swapping_strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();

        System.out.println(s1.length() + " " + s2.length());
        System.out.println(s1 + s2);

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        char temp = s1Array[0];
        s1Array[0] = s2Array[0];
        s2Array[0] = temp;

        System.out.println(new String(s1Array) + " " + new String(s2Array));
    }
}

