package chapter1.chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

class Parentheses {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        while (!StdIn.isEmpty()) {
            String rightBracket = StdIn.readString();
            String leftBracket = stack.pop();

            if (!isMatch(rightBracket, leftBracket)) {
                if (leftBracket != null) {
                    stack.push(leftBracket);
                }
                stack.push(rightBracket);
            }
        }

        if (stack.isEmpty()) {
            StdOut.println(true);
        } else {
            StdOut.println(false);
        }
    }

    public static boolean isMatch(String rightBracket, String leftBracket) {
        if (rightBracket.equals(")") && leftBracket.equals("(")) {
            return true;
        }
        if (rightBracket.equals("]") && leftBracket.equals("[")) {
            return true;
        }
        if (rightBracket.equals("}") && leftBracket.equals("{")) {
            return true;
        }

        return false;
    }
}
