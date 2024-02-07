package Feb_06_Assignment01;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;
//14.How to Sort a Stack using Recursion
//Given a stack, the task is to sort it using recursion.
//
//Example:
//
//Input: elements present in stack from top to bottom -3 14 18 -5 30
//Output: 30 18 14 -3 -5
//Explanation: The given stack is sorted know 30 > 18 > 14 > -3 > -5
//
//Input: elements present in stack from top to bottom 1 2 3
//Output: 3 2 1
//Explanation: The given stack is sorted know 3 > 2 > 1


public class Q14_SortStack
{
    static void sortedInsert(Stack<Integer> s, int x)
    {
        // Base case: Either stack is empty or newly
        // inserted item is greater than top (more than all
        // existing)
        if (s.isEmpty() || x > s.peek()) {
            s.push(x);
            return;
        }

        // If top is greater, remove the top item and recur
        int temp = s.pop();
        sortedInsert(s, x);

        // Put back the top item removed earlier
        s.push(temp);
    }

    // Method to sort stack
    static void sortStack(Stack<Integer> s)
    {
        // If stack is not empty
        if (!s.isEmpty()) {
            // Remove the top item
            int x = s.pop();

            // Sort remaining stack
            sortStack(s);

            // Push the top item back in sorted stack
            sortedInsert(s, x);
        }
    }

    // Utility Method to print contents of stack
    static void printStack(Stack<Integer> s)
    {
        ListIterator<Integer> lt = s.listIterator();

        // forwarding
        while (lt.hasNext())
            lt.next();

        // printing from top to bottom
        while (lt.hasPrevious())
            System.out.print(lt.previous() + " ");
    }

    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        s.push(11);
        s.push(88);
        s.push(19);
        s.push(01);
        s.push(55);

        System.out.println("Stack elements before sorting: ");
        printStack(s);
        sortStack(s);
        System.out.println("Stack elements after sorting:");
        printStack(s);

    }


}
