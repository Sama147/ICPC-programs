package all_files;
import java.util.Scanner;


public class power_of_1378
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    int base = 1378;
	    int result = modularExponentiation(base, n, 10);
	    System.out.println(result);
	}

	static int modularExponentiation(int base, int exponent, int modulus) 
	{
		if (modulus == 1) return 0;
	    int result = 1;
	    base = base % modulus;
	    while (exponent > 0) 
	    {
	    	if (exponent % 2 == 1) 
	    	{
	    		result = (result * base) % modulus;
	    	}
	    exponent = exponent >> 1;
	    base = (base * base) % modulus;
	    }
	    return result;
	}
}



