package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax25to5Then25() {
        int left = 25;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 25;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when120to15Then120() {
        int left = 15;
        int right = 120;
        int result = Max.max(left, right);
        int expected = 120;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when30to30Then30() {
        int left = 30;
        int right = 30;
        int result = Max.max(left, right);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }
}
