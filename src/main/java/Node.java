import com.google.common.base.Objects;

public class Node {
  private final int value;
  private Node left;
  private Node right;

  public Node(int val) {
    value = val;
    left = null;
    right = null;
  }

  public Node setLeft(Node left) {
    this.left = left;
    return this;
  }

  public Node setRight(Node right) {
    this.right = right;
    return this;
  }

  public int getValue() {
    return value;
  }

  public Node getLeft() {
    return left;
  }

  public Node getRight() {
    return right;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return value == node.value &&
        Objects.equal(left, node.left) &&
        Objects.equal(right, node.right);
  }
}