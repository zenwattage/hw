import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

/**
 * @author Scott Hansford
 * @version TA5
 * @version 11/20/20
 */

/**
 * Accepts a stack of integers as a parameter and returns a copy of the original
 * stack, while preserving the original stack
 */
public class CopyStack {

    /**
     *
     * @param s
     * @return copy
     */
    public static Stack<Integer> CopyStack(Stack<Integer> s) {
        Stack<Integer> copy = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<>();
        q.addAll(s);
        copy.addAll(q);
        return copy;
    }

    /**
     * Accepts a stack of integers as a parameter and replace the stack contents
     * with itself plus a mirrored version of itself
     * 
     * @param s
     * @return
     */
    public static Stack<Integer> mirror(Stack<Integer> s) {
        Stack<Integer> copy = new Stack<Integer>();
        Stack<Integer> copy2 = new Stack<Integer>();
        copy.addAll(s);
        copy2.addAll(copy);
        while (!s.isEmpty()) {
            copy2.add(s.pop());
        }
        return copy2;
    }

    /**
     * Test our methods
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {5, 8, 16, 7, 9};
        Stack<Integer> og = new Stack<Integer>();
        for(int each : arr){
            og.push(each);
        }

        System.out.println("Original stack = " + og);

        System.out.println("The copy stack = " + CopyStack(og));

        System.out.println("Original stack = " + og);

        System.out.println("The mirror Stack is: " + mirror(og));

        /**
         * Sample runs:
         * 
         * Original stack = [5, 8, 16, 7, 9]
         * 
         * The copy stack = [5, 8, 16, 7, 9]
         * 
         * Original stack = [5, 8, 16, 7, 9]
         * 
         * The mirror Stack is : [5, 8, 16, 7, 9, 9, 7, 16, 8, 5]
         */
    }

}