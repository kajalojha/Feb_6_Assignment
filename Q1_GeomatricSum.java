package Feb_06_Assignment01;
import java.util.Scanner;

//1.Problem statement
//        Given k, find the geometric sum i.e.
//
//1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
//Note :
//using recursion.
//
//Sample Input 1 :
//        3
//Sample Output 1 :
//        1.87500
//Sample Input 2 :
//        4
//Sample Output 2 :
//        1.93750
//Explanation for Sample Input 1:
//        1+ 1/(2^1) + 1/(2^2) + 1/(2^3) = 1.87500
public class Q1_GeomatricSum
{
    public static double pow(int b , int num) // to find power
    {
        if(b==0)//base case
        {
            return 0 ;
        }if(num==0) // base case when num ==0
        {
            return 1 ;
        }
       return b * pow(b , num-1); // find powrer
    }
    public static double geomatricsum( int n ) // to find geomatric sum
    {
        if(n == 0) // base case when num ==0 then return 1
        {
            return 1;
        }
      double sum =  geomatricsum(n-1) + 1/pow(2,n);// call function with (n-1) and find the power and divide by
        // one and then add both
      return sum;

    }
  public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int num= sc.nextInt();
//        System.out.println("enter base");
//        int b = sc.nextInt();
        //int power = pow(b , num);
        //System.out.println(power);
        double ans = geomatricsum(num);
        System.out.println(ans);


    }
}
