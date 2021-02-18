
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChallengeTest {
  @Test
  public void shouldHandleSingleDigits() {
    assertEquals("0", Challenge.numberToOrdinal(0));
    assertEquals("1st", Challenge.numberToOrdinal(1));
    assertEquals("2nd", Challenge.numberToOrdinal(2));
    assertEquals("3rd", Challenge.numberToOrdinal(3));
    assertEquals("4th", Challenge.numberToOrdinal(4));
    assertEquals("9th", Challenge.numberToOrdinal(9));
  }
  @Test
  public void shouldHandleTeenNumbers() {
    assertEquals("10th", Challenge.numberToOrdinal(10));
    assertEquals("11th", Challenge.numberToOrdinal(11));
    assertEquals("12th", Challenge.numberToOrdinal(12));
    assertEquals("13th", Challenge.numberToOrdinal(13));
  }
  @Test
  public void shouldHandleTeenNumbersBiggerThan100() {
    assertEquals("111th", Challenge.numberToOrdinal(111));
    assertEquals("114th", Challenge.numberToOrdinal(114));
  }

  @Test
  public void shouldHandleNumbersBiggerThan10() {
    assertEquals("33rd", Challenge.numberToOrdinal(33));
    assertEquals("92nd", Challenge.numberToOrdinal(92));
  }

  @Test (expected = IllegalArgumentException.class)
  public void shouldThrowIllegalArgumentExceptionOnNumbersBiggerThan10000() {
    Challenge.numberToOrdinal(10001);
  }
}