import java.util.Stack;

/**
 * @author Scott Hansford
 * @version TA5
 */
class Copystack {

    public static Stack<Integer> copyStack(Stack<Integer> s) {
        Stack<Integer> copy = new Stack<Integer>();
        copy.addAll(s);
        return copy;
    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        Stack<Integer> og = new Stack<Integer>();
        og.push(5);
        og.push(8);
        og.push(16);
        og.push(7);
        og.push(9);

        System.out.println("Original stack = " + og);

        System.out.println("The copy stack = " + copyStack(og));

        System.out.println("The original stack = " + og);

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