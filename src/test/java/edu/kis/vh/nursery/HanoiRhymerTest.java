package edu.kis.vh.nursery;

import junit.framework.TestCase;

public class HanoiRhymerTest extends TestCase {

    public void testInitial() {
        HanoiRhymer rhymer = new HanoiRhymer();
        assertEquals(0, rhymer.reportRejected());
    }
    public void testRhymer() {
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(1);
        rhymer.countIn(2);
        rhymer.countIn(3);
        rhymer.countIn(4);
        assertEquals(3, rhymer.reportRejected());
        rhymer.countIn(5);
        assertEquals(4, rhymer.reportRejected());
    }
}