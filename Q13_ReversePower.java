package Feb_06_Assignment01;
import java.util.Scanner;
//Find the value of a number raised to its reverse
//Given a number N and its reverse R. The task is to find the number obtained when the number is
// raised to the power of its own reverse. The answer can be very large, return the result modulo
// 109+7.
//
//Examples:
//Input : N = 2, R = 2
//Output: 4
//Explanation: Number 2 raised to the power of its reverse 2 gives 4 which gives 4 as a result after
// performing modulo 109+7
//
//Input : N = 57, R = 75
//Output: 262042770
//Explanation: 5775 modulo 109+7 gives us the result as 262042770

public class Q13_ReversePower
{
    public static long reversepow(int b , int p)
    {
    if(b ==0) // base case
    {
        return 0;
    }
    if(p ==0 )// base case
    {
        return 1 ;
    }
       return   b* reversepow(b , p-1)%1000000007; // multiply b and call the function and decrease the pow by 1
        // find the modulo by 1000000007
}

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  base");
        int base = sc.nextInt();
        System.out.println("enter power");
        int pow = sc.nextInt();
        long ans = reversepow(base , pow);
        System.out.println(ans);
    }
}
