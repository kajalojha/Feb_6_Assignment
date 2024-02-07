package Feb_06_Assignment01;
import java.util.Scanner;
//Problem statement
//Write a recursive function to convert a given string into the number it represents.
// That is input will be a numeric string that contains only numbers, you need to convert the string into
// corresponding integer and return the answer.
//
//Sample Input 1 :
//        00001231
//Sample Output 1 :
//        1231
//Sample Input 2 :
//        12567
//Sample Output 2 :
//        12567
public class Q3_convertStringIntoNumber
{
    public static int convertString(String s )
    {
        if(s.length()==1) // base condition
        {
            return s.charAt(0)-'0';
            // Ascii code of 0 is 48 to convert string into integer we subtracted from 0
            // so whatever the we subtract bfore 0 gives same num
        }
       int ans =  convertString(s.substring(0, s.length()-1));// call function again
        // use substring function
        int lastDigit = s.charAt(s.length()-1)-'0'; // for last digit
        return ans*10+lastDigit; // 123*10+4 = 1230+4 = 1234
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
         String str = sc.next(); // take input from user
        int num = convertString(str);
        System.out.println(num);
    }
}
