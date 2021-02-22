import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChallengeTest {


  @Test
  public void shouldSayHello() {
    assertEquals("Hello, Qualified!", Spreader.sayHello("Qualified"));
  }
  private Spreader spreader;
  private Node initialNode = new Node(5)
      .setLeft(new Node(2))
      .setRight(new Node(8)
          .setLeft(new Node(7))
          .setRight(new Node(12)));

  @BeforeEach
  public void setUp() throws Exception {
    spreader = new Spreader();
  }

  @Test
  public void rotateRight_shouldReturnRotatedNode() throws Exception {
    Node resultNode = new Node(2)
        .setRight(new Node(5)
            .setRight(new Node(8)
                .setLeft(new Node(7))
                .setRight(new Node(12))));
    assertThat(spreader.rotateRight(initialNode), is(resultNode));

  }

  @Test
  public void rotateLeft_shouldReturnRotatedNode() throws Exception {
    Node resultNode = new Node(8)
        .setLeft(new Node(5)
            .setLeft(new Node(2))
            .setRight(new Node(7)))
        .setRight(new Node(12));
    assertThat(spreader.rotateLeft(initialNode), is(resultNode));
  }
}
