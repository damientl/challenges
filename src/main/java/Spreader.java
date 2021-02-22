
class Spreader {

  public static String sayHello(String name) {
    // You can print to STDOUT for debugging if you need to:
    System.out.print(name);

    // but you need to return the correct value in order to pass the challenge
    return "Hello, " + name + '!';
  }

  public Node rotateRight(Node root) {
    if (root.getLeft() == null) {
      throw new IllegalArgumentException("cannot rotate to right. No left children");
    }
    Node childRight = root.getLeft().getRight();

    Node newRoot = root.getLeft();
    newRoot.setRight(root);

    root.setLeft(childRight);

    return newRoot;
  }

  public Node rotateLeft(Node root) {



    return root; // Replace with your solution
  }
}
