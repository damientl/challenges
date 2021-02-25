import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class ChallengeTest {


  @Test
  public void shouldSayHello() {
    assertEquals("Hello, Qualified!", Challenge.sayHello("Qualified"));
  }
}
