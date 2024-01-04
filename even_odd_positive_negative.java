package all_files;

import java.util.Scanner;
public class even_odd_positive_negative 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
        int x1,pos=0,neg=0,e=0,o=0;
         x1=scan.nextInt();
        for (int i = 0 ; i < x1 ; i++ )
        {
        	int x=scan.nextInt();
            if (x>0)
            {   
                if (x%2!=0 || x%-2!=0 || x==0 )
                {
                     pos++;
                     o++;
                }
                else
                {
                    pos++;
                    e++;
                }
            }
            else if (x<0 )
            {
                   if (x%-2!=0 || x%2!=0 ||x==0 )
                {
                    neg++;
                    o++;
                }
                else
                {
                    neg++;
                    e++;
                }
            }
            else 
            {
                e++;
            }
        }
           System.out.println("Even: " + e);
            System.out.println("Odd: " + o);
            System.out.println("Positive: " + pos);
            System.out.println("Negative: " + neg);
	}
}

