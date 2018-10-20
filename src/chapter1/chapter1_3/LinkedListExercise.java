package chapter1.chapter1_3;

import edu.princeton.cs.algs4.StdOut;

public class LinkedListExercise {
    private class Node {
        String item;
        Node next;
    }

    private Node first = new Node();
    private Node key = new Node();

    public static void main(String[] args) {
        String[] items = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        String[] test1 = {"a", "b"};
        String[] test2 = {"a"};
        LinkedListExercise list = new LinkedListExercise();
        Node key = list.key;
        key.item = "D";
        list.createList(items);
        list.printLinkedList(list.first);
        //list.delete(list.first,2);
        //StdOut.println(list.find(list.first,"R"));
        //list.removeAfter(list.first);
        //list.remove(list.first,"J");
        //StdOut.println(list.maxRecursive(list.first.next));
        Node reverse = list.reverseRecursive(list.first);
        list.printLinkedList(reverse);
    }

    public void createList(String[] items) {
        for (String s : items) {
            add(s);
        }
    }

    public void add(String s) {
        Node last = new Node();
        last.item = s;

        Node temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = last;
    }

    public void printLinkedList(Node first) {
        if (first.next == null) {
            StdOut.println(null);
            return;
        }
        Node next = first.next;
        while (next.next != null) {
            StdOut.print(next.item + " -> ");
            next = next.next;

        }
        StdOut.print(next.item);
        StdOut.println();
    }

    //Exercise1319
    public void deleteLast(Node first) {
        if (first == null) {
            return;
        }

        if (first.next == null) {
            first = null;
            return;
        }
        Node next = first;
        while (next.next.next != null) {
            next = next.next;
        }
        next.next = null;
    }

    //Exercise1320
    public void delete(Node first, int k) {
        Node next = first;
        for (int i = 0; next != null; i++) {
            if (i == k - 1) {
                StdOut.println("delete: " + next.next.item);
                next.next = next.next.next;
                return;
            }
            next = next.next;
        }
    }

    //Exercise1321
    public boolean find(Node first, String key) {
        Node next = first;
        while (next != null) {
            if (next.item == key) {
                return true;
            }
            next = next.next;
        }
        return false;
    }

    //Exercise1324 题意不明
    public void removeAfter(Node first) {
        if (first == null || first == null) {
            return;
        }

        first.next.next = null;
    }

    //Exercise1325 题意不明
    public void insertAfter(Node first, Node second) {
        if (first == null || second == null) {
            return;
        }
    }

    //Exercise1326
    public void remove(Node first, String key) {
        Node next = first;
        while (next.next != null) {
            if (next.next.item.equals(key)) {
                if (next.next.next == null) {
                    next.next = null;
                    return;
                }
                next.next = next.next.next;
            }
            next = next.next;
        }
    }

    //Exercise1327
    public String max(Node first) {
        if (first.next == null) {
            return "0";
        }
        Node next = first.next;
        String max = next.item;
        while (next != null) {
            if (next.item.compareTo(max) > 0) {
                max = next.item;
            }
            next = next.next;
        }
        return max;
    }

    //Exercise1328
    public String maxRecursive(Node first) {
        if (first == null) {
            return "0";
        }

        if (first.next != null) {
            return first.item.compareTo(maxRecursive(first.next)) > 0 ? first.item : maxRecursive(first.next);
        } else {

            return first.item;
        }
    }

    //Exercise1330
    public Node reverse(Node x) {
        Node first = x.next;
        Node reverse = null;
        while (first != null) {
            Node second = first.next;
            first.next = reverse;
            reverse = first;
            first = second;
        }
        return reverse;
    }

    //Exercise1330 Recursive
    public Node reverseRecursive(Node first) {
        if (first == null) {
            return null;
        }

        if (first.next == null) {
            return first;
        }

        Node second = first.next;
        Node rest = reverseRecursive(second);
        second.next = first;
        first.next = null;
        return rest;
    }
}
