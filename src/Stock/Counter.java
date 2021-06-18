package Stock;

public class Counter {
    private int value;
    private double sum;

    public Counter() {
    }

    public Counter(int value) {
        this.value = value;
    }

    public Counter(double sum) {
        this.sum = sum;
    }

    public synchronized int increment() {
        return value++;
    }

    public synchronized double addSum(double addSum) {
        return sum += addSum;
    }

    public synchronized int getValue() {
        return value;
    }

    public synchronized double getSum() {
        return sum;
    }
}
