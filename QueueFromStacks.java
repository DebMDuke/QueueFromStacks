/******************************************************************************
 *  Compilation:  javac QueueWithTwoStacks.java
 *  Execution:    java QueueWithTwoStacks < input.txt
 *  Dependencies: StdIn.java StdOut.java
 *  Data files:   https://algs4.cs.princeton.edu/13stacks/tobe.txt
 *
 *  A generic queue, implemented using two stacks.
 *
 *  % java QueueWithTwoStacks < tobe.txt
 *  to be or not to be (2 left on queue)
 *
 ******************************************************************************/
import java.util.Stack;
import java.util.NoSuchElementException;

public class QueueFromStacks<T> {
    private Stack<T> entryStack;    // back of queue
    private Stack<T> reorderingStack;    // front of queue

    // create an empty queue
    public QueueFromStacks() {
        entryStack = new Stack<T>();
        reorderingStack = new Stack<T>();
    }

    // move all items from stack1 to stack2
    private void moveFromEntryStackToReorderingStack() {

    }

    // is the queue empty?
    public boolean isEmpty() {

    }

    // return the number of items in the queue.
    public int size() {


    }

    // return the item least recently added to the queue.
    public T peek() {


    }

    // add the item to the queue
    public void enqueue(T item) {


    }

    // remove and return the item on the queue least recently added
    public T dequeue() {


    }


    // a test client
    public static void main(String[] args) {
        QueueFromStacks<String> queue = new QueueFromStacks<String>();

        String[] item = "To be or not to be, that is the question.".split(" ");

        queue.enqueue(item[8]);
        queue.enqueue(item[9]);
        queue.enqueue(item[7]);

        for(int i = 0; i < 6; i++)
          queue.enqueue(item[i]);

        System.out.println("Words in queue: " + queue.size());

        while(!queue.isEmpty())
          System.out.print(queue.dequeue() + " ");
        System.out.print("\n");
    }
}
