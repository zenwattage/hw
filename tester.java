
  import java.util.Queue;
  import java.util.Stack;
  import java.util.LinkedList;

class Tester{

    public static void main(String[] args) {
      
      Stack<String> s = new Stack<>();

      Queue<String> q = new LinkedList<>();

      s.push("How");

      s.push("Are");

      s.push("You");

      while (!s.isEmpty()){

                  q.add(s.pop());

      }

      System.out.println(q);
    }
}
