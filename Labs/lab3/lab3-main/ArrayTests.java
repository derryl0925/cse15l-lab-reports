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
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }


  @Test
  public void reverseInPlace() {
    int[] input1 = {2, 3, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4, 3, 2}, input1);
  }



  @Test
  public void reversed() {
    int[] input1 = {1, 2, 3, 4, 5};
    assertArrayEquals(new int[] {5, 4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }


  @Test
  public void averageWithoutLowest() {
    //double[] input1 = {1, 2, 3, 4 , 5};
    // doubles don't need Array in there, (expected, actual, margin of error)
    //assertEquals(7, ArrayExamples.averageWithoutLowest(input1),0);

    // what if multiple instances of lowest? only drop one instance of the lowest
    double[] input1 = {1.0, 1.0, 2.0, 3.0, 6.0};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1),0);

  }
}
