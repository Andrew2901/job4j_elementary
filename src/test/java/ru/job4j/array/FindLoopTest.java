package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[]{5, 4, 3, 2};
        int el = 6;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void whenArrHas5Then4() {
        int[] data = {3, 5, 8, 4, 6, 1, 9, 7, 0, 2};
        int el = 6;
        int start = 2;
        int finish = 6;
        int expected = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrHasNot3ThenMinus1() {
        int[] data = {5, 4, 2, 7, 1, 5, 3, 9, 2};
        int el = 3;
        int start = 1;
        int finish = 5;
        int expected = -1;
        int result = FindLoop.indexOf(data, el, start, finish);
        assertThat(result).isEqualTo(expected);
    }
}
