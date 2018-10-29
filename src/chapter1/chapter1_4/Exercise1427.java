package chapter1.chapter1_4;

import chapter1.chapter1_3.Stack;

public class Exercise1427 {
    private Stack stack1 = new Stack();
    private Stack stack2 = new Stack();

    public void enqueue(String s) {
        stack1.push(s);
    }

    public String dequeue() {
        if (!stack2.isEmpty()) {
            return (String) stack2.pop();
        } else {
            pour(stack1, stack2);
            return (String) stack2.pop();
        }
    }

    public void pour(Stack stack1, Stack stack2) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
}
