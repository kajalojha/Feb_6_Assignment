package Feb_06_Assignment01;
import  java.util.Scanner;
//    .Problem statement
//Determine if a given string ‘S’ is a palindrome using recursion. Return a Boolean value of true if it is
// a palindrome and false if it is not.
//
//        Note: You are not required to print anything, just implement the function. Example:
//Input: s = "racecar"
//Output: true
//Explanation: "racecar" is a palindrome.
//
//Sample Input 1:
//abbba
//Sample Output 1:
//        true
//Explanation Of Sample Input 1 :
//        “abbba” is a palindrome
//Sample Input 2:
//abcd
//Sample Output 2:
//        false
//Explanation Of Sample Input 2 :
//        “abcd” is not a palindrome.
//Constraints:
//        0 <= |S| <= 10^6
//where |S| represents the length of string S.
public class Q2_Palendrom
{
//
public static boolean isPalindrome(String s ,  int i,int j  ) //here we pass string , i , j
{
    if(s.charAt(i)!= s.charAt(j)) // if charAt(i) is not eqaul to charAt(j) then we return false
    {
        return  false;
    }
   if(j<=i) // if i==j or i is greater than j then we return true
   {
      return true;
   }
 return isPalindrome(s , i+1 ,j-1); // here we call the function the string is same but i is increase by 1
    // j is decrease by 1 . like if i is 1 than it become 2 and j is 5 than it become 4.
}

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the string ");
        String str = sc.next();
        int j = str.length(); // length of string
        int i =0;

       boolean s = isPalindrome(str , i , j-1); // hre we decrease the length by 1 beacuse we want to start with
        // last index . like total length is 6 but the last index is 5 because indexing start with 0.
        System.out.println(s);


    }

}
