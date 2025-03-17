package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INT12 = 12;
    public static final int INTNEGATIVE1 = -1;
    private final int[] NUMBERS = new int[INT12];

    public int total = INTNEGATIVE1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == INTNEGATIVE1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return INTNEGATIVE1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return INTNEGATIVE1;
        return NUMBERS[total--];
    }

}
