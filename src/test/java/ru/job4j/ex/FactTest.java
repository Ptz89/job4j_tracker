package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenStartThenFinish() {
        Fact.calc(-1);
    }

    @Test
    public void whenTwoThenTwo() {
        int rsl = Fact.calc(2);
        assertThat(rsl, is(2));
    }
}