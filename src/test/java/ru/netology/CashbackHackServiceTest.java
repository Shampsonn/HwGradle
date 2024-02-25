package ru.netology;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void RemainTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void RemainTestWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(expected, actual);
    }
}