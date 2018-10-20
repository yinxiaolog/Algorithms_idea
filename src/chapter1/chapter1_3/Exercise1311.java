package chapter1.chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

class EvaluatePostfix {
    public static void main(String[] args) {
        Stack<Double> vals = new Stack<Double>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("+")) {
                Double v = vals.pop();
                vals.push(vals.pop() + v);
            } else if (s.equals("-")) {
                Double v = vals.pop();
                vals.push(vals.pop() - v);
            } else if (s.equals("*")) {
                Double v = vals.pop();
                vals.push(vals.pop() * v);
            } else if (s.equals("/")) {
                Double v = vals.pop();
                vals.push(vals.pop() / v);
            } else {
                vals.push(Double.parseDouble(s));
            }
        }

        StdOut.println(vals.pop());
    }
}
