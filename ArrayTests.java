import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlace1() {
    int[] input1 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input1) ;
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed1() {
    int[] input1 = {1, 2, 3, 4, 5};
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testAverage() {
      double[] input = {4, 3, 5, 1, 2};
      assertEquals(3.5, ArrayExamples.averageWithoutLowest(input), 0);
  }

  @Test 
  public void testAverage1() {
      double[] input = {1};
      assertEquals(0, ArrayExamples.averageWithoutLowest(input), 0);
  }

  @Test
  public void testAverage2() {
    double[] input = { };
    assertEquals(0, ArrayExamples.averageWithoutLowest(input), 0);
  }
}
