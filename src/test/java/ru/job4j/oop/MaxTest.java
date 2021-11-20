package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenLeft1Right2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenLeft3Right1Three4Then4() {
        int left = 3;
        int right = 1;
        int three = 4;
        int result = Max.max(left, right, three);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenLeft1Right1Three14Four2Then14() {
        int left = 1;
        int right = 1;
        int three = 14;
        int four = 2;
        int result = Max.max(left, right, three, four);
        int expected = 14;
        Assert.assertEquals(result, expected);
    }
}