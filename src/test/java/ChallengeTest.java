import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class ChallengeTest {

  @Test
  public void basicTests() {
    Spooner spooner = new Spooner();
    assertEquals("pit nicking", spooner.spoonerize("nit picking"));
    assertEquals("bedding wells", spooner.spoonerize("wedding bells"));
    assertEquals("belly jeans", spooner.spoonerize("jelly beans"));
  }
}
