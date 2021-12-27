package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.hamcrest.number.OrderingComparison.lessThan;
import static org.junit.Assert.*;

public class JobAscByPriorityTest {

    @Test
    public void whenFirstGreaterThanSecond() {
        int rsl = new JobAscByPriority().compare(
                new Job("job1", 3),
                new Job("job1", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenFirstLessThanSecond() {
        int rsl = new JobAscByPriority().compare(
                new Job("job1", 2),
                new Job("job1", 4)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenFirstEqualsToSecond() {
        int rsl = new JobAscByPriority().compare(
                new Job("job1", 2),
                new Job("job1", 2)
        );
        assertThat(rsl, equalTo(0));
    }
}