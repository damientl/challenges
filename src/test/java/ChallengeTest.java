import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class ChallengeTest {


  @Test
  public void shouldReturnMinString() {
    assertEquals("aksfaje",
        Challenge.MinWindowSubstring(new String[] {"ahffaksfajeeubsne", "jefaa"}));

    assertEquals("affhkkse",
        Challenge.MinWindowSubstring(new String[] {"aaffhkksemckelloe", "fhea"}));

  }
}
