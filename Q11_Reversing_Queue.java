package Feb_06_Assignment01;
import java.util.LinkedList;
import  java.util.Scanner;
import  java.util.Queue;
//11.Reversing a queue using recursion
//
//Given a queue, write a recursive function to reverse it.
//
//Standard operations allowed :
//
//enqueue(x) : Add an item x to rear of queue.
//dequeue() : Remove an item from front of queue.
//empty() : Checks if a queue is empty or not.
//
//Examples :
//Input : Q = [5, 24, 9, 6, 8, 4, 1, 8, 3, 6]
//Output : Q = [6, 3, 8, 1, 4, 8, 6, 9, 24, 5]
//
//Explanation : Output queue is the reverse of the input queue.
//
//        Input : Q = [8, 7, 2, 5, 1]
//Output : Q = [1, 5, 2, 7, 8]

public class Q11_Reversing_Queue
{
    static Queue<Integer> queue;
    // Recursive function to reverse the queue
    static Queue<Integer> reverseQueue(Queue<Integer> q)
    {
        // Base case
        if (q.isEmpty())
            return q;

        // Remove current item from front
        int data = q.peek();
        q.remove();

        // Reverse remaining queue
        q = reverseQueue(q);

        // Add current item to the rear
        q.add(data);

        return q;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        queue = new LinkedList<Integer>();

        queue.add(8);
        queue.add(7);
        queue.add(2);
        queue.add(5);
        queue.add(1);
        queue = reverseQueue(queue);
        System.out.println(queue);

    }
}
