package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAXSIZEOFARRAY = 12;
    public static final int ARRAYISEMPTY = -1;
    public static final int LASTELEMENTOFARRAY = MAXSIZEOFARRAY - 1;
    private final int[] NUMBERS = new int[MAXSIZEOFARRAY];

    public int total = ARRAYISEMPTY;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == ARRAYISEMPTY;
    }

    public boolean isFull() {
        return total == LASTELEMENTOFARRAY;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}
