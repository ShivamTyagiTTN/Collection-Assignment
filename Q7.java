//Q.7 Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))

import java.util.Stack;

class MyStack {
    Stack<Integer> s= new Stack<Integer>();
    Integer min;

    void push(Integer x) {
        if (s.isEmpty()) {
            min = x;
            s.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }
        if (x < min) {
            s.push(2 * x - min);
            min = x;
        } else
            s.push(x);

        System.out.println("Number Inserted: " + x);
    }

    void pop() {
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Top Most Element Removed: ");
        Integer t = s.pop();

        if (t < min) {
            System.out.println(min);
            min = 2 * min - t;
        } else
            System.out.println(t);
    }

    boolean isEmpty(){
        return s.isEmpty();
    }

    void getMin() {
        if (s.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Minimum Element in the stack is: " + min);
    }

}
public class Q7
{
    public static void main(String[] args)
    {
        MyStack s = new MyStack();
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        System.out.println(s.isEmpty());
    }
}

//Output:
//        Number Inserted: 3
//        Number Inserted: 5
//        Minimum Element in the stack is: 3
//        Number Inserted: 2
//        Number Inserted: 1
//        Minimum Element in the stack is: 1
//        Top Most Element Removed: 1
//        Minimum Element in the stack is: 2
//        Top Most Element Removed: 2
//        false