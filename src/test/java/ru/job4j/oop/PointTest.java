package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        double expected = 2;
        assertThat(expected, is(out));
    }

    @Test
    public void when01to03then2() {
        Point a = new Point(0, 1);
        Point b = new Point(0, 3);
        double out = a.distance(b);
        double expected = 2;
        assertThat(expected, is(out));
    }

    @Test
    public void when10to30then2() {
        Point a = new Point(1, 0);
        Point b = new Point(3, 0);
        double out = a.distance(b);
        double expected = 2;
        assertThat(expected, is(out));
    }

    @Test
    public void when01to03then211() {
        Point a = new Point(0, 1, 0);
        Point b = new Point(0, 3, 4);
        double out = a.distance3d(b);
        double expected = 4.47213595499958;
        assertThat(expected, is(out));
    }

    @Test
    public void when10to30then223() {
        Point a = new Point(1, 0, 1);
        Point b = new Point(3, 0, 1);
        double out = a.distance3d(b);
        double expected = 2;
        assertThat(expected, is(out));
    }
}