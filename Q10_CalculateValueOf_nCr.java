package Feb_06_Assignment01;
import java.util.Scanner;
//Program to calculate value of nCr using Recursion
//Given two numbers N and r, find the value of NCr using recursion
//
//Examples:
//
//Input: N = 5, r = 2
//Output: 10
//Explanation: The value of 5C2 is 10
//
//Input: N = 3, r = 1
//Output: 3
public class Q10_CalculateValueOf_nCr
{
    public static int calfact(int num)
    {
        if(num ==0) // base case
        {
            return 1;
        }
        return num * calfact(num-1); // find the factorial
    }
    public static int calculatenCr(int n , int r)
    {
        if(n==0 || n==1 ) // base case
        {
            return 1 ;
        }
       int ans = calfact(n)/(calfact(r)*calfact(n-r)); // call the function to find the factorial of n and
        // divide it by factorial of r * factorial of n-r
        return ans ;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println("enter the value of r");
        int r = sc.nextInt();
        //int ans = calfact(n);
        int ans = calculatenCr(n ,r);
        System.out.println(ans);

    }

}
