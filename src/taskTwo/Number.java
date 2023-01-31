package taskTwo;

public class Number {
    private final int num;

    public Number(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return " " + num;
    }
}
