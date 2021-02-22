import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Node {
  private final int value;
  private final Node left;
  private final Node right;
}