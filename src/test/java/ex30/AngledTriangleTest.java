package ex30;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AngledTriangleTest {
    @Test
    public void test1() {
        assertEquals(true, AngledTriangle.rightTriangle(3, 4, 5));
    }

    @Test
    public void test2() {
        assertEquals(true, AngledTriangle.rightTriangle(145, 105, 100));
    }

    @Test
    public void test3() {
        assertEquals(false, AngledTriangle.rightTriangle(70, 130, 110));
    }

    @Test
    public void test4() {
        assertEquals(false, AngledTriangle.rightTriangle(60, 60, 60));
    }

    @Test
    public void test5() {
        System.out.println("A triangle can't have an edge of length 0.");
        assertEquals(false, AngledTriangle.rightTriangle(0, 4, 4));
    }

    @Test
    public void test6() {
        System.out.println("A triangle can't have edges of negative length.");
        assertEquals(false, AngledTriangle.rightTriangle(-3, 4, 5));
    }

    @Test
    public void test7() {
        assertEquals(true, AngledTriangle.rightTriangle(115, 277, 252));
    }

    @Test
    public void test8() {
        assertEquals(false, AngledTriangle.rightTriangle(140, 170, 220));
    }

    @Test
    public void test9() {
        assertEquals(true, AngledTriangle.rightTriangle(915, 1748, 1973));
    }
}
