package Feb_06_Assignment01;
import java.util.Scanner;
//Given two integers M & N, calculate and return their multiplication using recursion.
// You can only use subtraction and addition for your calculation. No other operators are allowed.
//
//Sample Input 1 :
//        3
//        5
//Sample Output 1 :
//        15
//Sample Input 2 :
//        4
//        0
//Sample Output 2 :
//        0
public class Q7_Multiplication
{
    public static int multipy(int n , int m)
    {
   if  (n ==0 || m ==0)// base case when any of the number is 0 return 0
   {
        return 0;
   }
  int ans = multipy(n , m-1); // call the function  pass n same and decrease m by 1 store it in ans
        // add both n and ans return
   return n+ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num1");
        int num1 = sc.nextInt();
        System.out.println("enter the num2");
        int num2 = sc.nextInt();
        int sum = multipy(num1 , num2);
        System.out.println(sum);
    }
}
