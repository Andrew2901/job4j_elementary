package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }
    @Test
    public void whenMax25to5Then25() {
        int left = 25;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 25;
        Assert.assertEquals(result, expected);
    }
    @Test
    public void when120to15Then120() {
        int left = 15;
        int right = 120;
        int result = Max.max(left, right);
        int expected = 120;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when30to30Then30() {
        int left = 30;
        int right = 30;
        int result = Max.max(left, right);
        int expected = 30;
        Assert.assertEquals(result, expected);
    }
}