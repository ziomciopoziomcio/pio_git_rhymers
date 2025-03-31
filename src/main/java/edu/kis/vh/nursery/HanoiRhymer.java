package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer liczy odrzucone warunki.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje wartosc do stosu, jezeli jest ona wieksza od wartosci na szczycie stosu.
     * W przeciwnym wypadku zwieksza licznik odrzuconych wartosci.
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    /**
     * Zwraca liczbe odrzuconych wartosci.
     */
    public int getTotalRejected() {
        return totalRejected;
    }

}