
import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class ChallengeTest {
  private Calc calc = new Calc();

  @Test
  public void shouldWorkForAnEmptyString() {
    assertEquals(0, calc.evaluate(""), 0);
  }

  @Test
  public void shouldWorkWithAFewOperations() {
    assertEquals(14, calc.evaluate("5 1 2 + 4 * + 3 -"), 0);
  }

  @Test
  public void shouldParseNumbers() {
    assertEquals(3, calc.evaluate("1 2 3"), 0);
  }

  @Test
  public void shouldParseFloats() {
    assertEquals(3.5, calc.evaluate("1 2 3.5"), 0);
  }

  @Test
  public void shouldSupportAddition() {
    assertEquals(4, calc.evaluate("1 3 +"), 0);
  }

  @Test
  public void shouldWorkWithBiggerNumberAddition() {
    assertEquals(1123, calc.evaluate("1000 123 +"), 0);
  }

  @Test
  public void shouldSupportMultiplication() {
    assertEquals(3, calc.evaluate("1 3 *"), 0);
  }

  @Test
  public void shouldSupportSubtraction() {
    assertEquals(-2, calc.evaluate("1 3 -"), 0);
  }

  @Test
  public void shouldSupportDivision() {
    assertEquals(2, calc.evaluate("4 2 /"), 0);
  }

  @Test
  public void shouldSupportMoreSpaces() {
    assertEquals(2, calc.evaluate(" 4  2 / "), 0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldThrowExceptionIfOperationHasNotEnoughOperands() {
    assertEquals(2, calc.evaluate("4 /"), 0);
  }
}