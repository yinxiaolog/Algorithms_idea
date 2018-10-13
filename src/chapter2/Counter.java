package chapter2;

public class Counter {
    private final String name;
    private int count = 0;

    public Counter(String id) {
        this.name = id;
    }

    public void increment() {
        count++;
    }

    public int tally() {
        return count;
    }

    @Override
    public String toString() {
        return count + " " + name;
    }
}
