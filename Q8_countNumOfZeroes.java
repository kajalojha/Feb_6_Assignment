package Feb_06_Assignment01;
import java.util.Scanner;
//.Problem statement
//Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
//
//Sample Input 1 :
//        0
//Sample Output 1 :
//        1
//Sample Input 2 :
//        00010204
//Sample Output 2 :
//        2
//Explanation for Sample Output 2 :
//Even though "00010204" has 5 zeros, the output would still be 2 because when you convert it
// to an integer, it becomes 10204.
//Sample Input 3 :
//        708000
//Sample Output 3 :
//        4
public class Q8_countNumOfZeroes
{
    public static int countZero( int n  )
    {

        if(n==0) // base case
        {
            return 0;
        }
        if(n%10==0) // when ever n%10 =0 means remainder is 0 then add 1 and divide the num by 10
        {
            return (1+ countZero(n/10 ));
        }else
        {
            return countZero(n/10 ); // call the function and divide the number ny 10
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int count =0;
         int ans = countZero(num  );
        System.out.println(ans);

    }
}
