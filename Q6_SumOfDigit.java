package Feb_06_Assignment01;
import java.util.Scanner;
//Problem statement
//Write a recursive function that returns the sum of the digits of a given integer.
//
//Sample Input 1 :
//        12345
//Sample Output 1 :
//        15
//Sample Input 2 :
//        9
//Sample Output 2 :
//        9
public class Q6_SumOfDigit
{
    public static int sumOfDigit( int num , int sum )
    {
        if(num == 0 ) // base case
        {
            return 0;
        }

        return num%10 + sumOfDigit(num/10 , sum ); // find the modulus of number by dividing 10 we find the remainder
        // then call the function and divide number by 10 so that number become shot
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the num");
        int num = sc.nextInt();
        int sum =0 ;
        int i=0;
         int ans = sumOfDigit(num , 0 );
        System.out.println(ans);
    }
}
