package ex16;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ArrayOfMultiplesTest {
    @Test
    public void test1() {
        assertArrayEquals(new int[] { 7, 14, 21, 28, 35 }, ArrayOfMultiples.arrayOfMultiples(7, 5));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[] { 12, 24, 36, 48, 60, 72, 84, 96, 108, 120 }, ArrayOfMultiples.arrayOfMultiples(12, 10));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[] { 17, 34, 51, 68, 85, 102, 119 }, ArrayOfMultiples.arrayOfMultiples(17, 7));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[] { 630, 1260, 1890, 2520, 3150, 3780, 4410, 5040, 5670, 6300, 6930, 7560, 8190, 8820 }, ArrayOfMultiples.arrayOfMultiples(630, 14));
    }

    @Test
    public void test5() {
        assertArrayEquals(new int[] { 140, 280, 420 }, ArrayOfMultiples.arrayOfMultiples(140, 3));
    }

    @Test
    public void test6() {
        assertArrayEquals(new int[] { 7, 14, 21, 28, 35, 42, 49, 56 }, ArrayOfMultiples.arrayOfMultiples(7, 8));
    }

    @Test
    public void test7() {
        assertArrayEquals(new int[] { 11, 22, 33, 44, 55, 66, 77, 88, 99, 110, 121, 132, 143, 154, 165, 176, 187, 198, 209, 220, 231 }, ArrayOfMultiples.arrayOfMultiples(11, 21));
    }
}
