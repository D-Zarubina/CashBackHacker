package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    @Test
    public void testRemainForFiveHundred() {
        CashbackHackService service = new CashbackHackService();

        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainForOneThousand() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainForZero() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

}