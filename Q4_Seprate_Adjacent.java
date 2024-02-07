package Feb_06_Assignment01;
import java.util.Scanner;
//Given a string S, compute recursively a new string where identical chars that are adjacent in the
// original string are separated from each other by a "*".
//
//Sample Input 1 :
//hello
//Sample Output 1:
//hel*lo
//Sample Input 2 :
//aaaa
//Sample Output 2 :
//a*a*a*a
public class Q4_Seprate_Adjacent
{
    public static String Seprateadjacen(String s ) // create function and pass string s
    {
       if(s.length()== 1) // base case . when length is equal to 1 than return string
       {
           return s ;
       }
       if(s.charAt(0) == s.charAt(1))// check that the value of at 0 is equal to value at 1
       {
           return s.charAt(0) + "*" + Seprateadjacen(s.substring(1)); // return char at 0 and place star
           // and call the function substring and start with 1
       }
       else
       {
           return s.charAt(0) + Seprateadjacen(s.substring(1)); // else add the chat at 0 and call the function

       }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();
        String g = Seprateadjacen(str);
        System.out.println(g);

    }
}
