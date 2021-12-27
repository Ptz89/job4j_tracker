package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.hamcrest.number.OrderingComparison.lessThan;
import static org.junit.Assert.*;

public class JobAscByNameTest {

    @Test
    public void whenFirstGreaterThanSecond() {
        int rsl = new JobAscByName().compare(
                new Job("job4", 1),
                new Job("job1", 3)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenFirstLessThanSecond() {
        int rsl = new JobAscByName().compare(
                new Job("job1", 2),
                new Job("job2", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenFirstEqualsToSecond() {
        int rsl = new JobAscByName().compare(
                new Job("job1", 2),
                new Job("job1", 2)
        );
        assertThat(rsl, equalTo(0));
    }
}