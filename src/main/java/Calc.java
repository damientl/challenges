import static java.lang.Float.parseFloat;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.BiFunction;
import lombok.Data;

class Calc {

  public double evaluate(String expr) {

    final Deque<Element> stack = new ArrayDeque<>();

    Arrays.stream(expr.trim().split(" "))
        .map(this::parse)
        .filter(e -> !(e instanceof InvalidElement))
        .forEach(element -> {
          if (element instanceof Operation) {
            Value first = popFromStack(stack);
            Value second = popFromStack(stack);
            stack.addFirst(new Value(
                ((Operation) element).getOperation()
                    .apply(first.getValue(), second.getValue())
            ));
          } else {
            stack.addFirst(element);
          }
        });

    if (stack.size() == 0) {
      return 0;
    }

    return ((Value) stack.removeFirst()).getValue();
  }

  private Value popFromStack(final Deque<Element> stack) {
    try {
      return (Value) stack.removeFirst();
    } catch (NoSuchElementException e) {
      throw new IllegalArgumentException("Expression cannot be evaluated. Missing operands.");
    }
  }

  private Element parse(final String elementStr) {

    final Optional<Operation> op = getOperation(elementStr);
    if (op.isPresent()) {
      return op.get();
    }

    final Optional<Float> value = getFloatValue(elementStr);
    if (value.isPresent()) {
      return value.map(Value::new).get();
    }

    return new InvalidElement();
  }

  private Optional<Operation> getOperation(final String elementStr) {
    switch (elementStr) {
      case "+":
        return Optional.of(
            new Operation(Float::sum));
      case "-":
        return Optional.of(
            new Operation((first, second) -> second - first));
      case "*":
        return Optional.of(
            new Operation((first, second) -> second * first));
      case "/":
        return Optional.of(
            new Operation((first, second) -> second / first));
      default:
        return Optional.empty();
    }
  }

  private Optional<Float> getFloatValue(final String elementStr) {
    try {
      return Optional.of(parseFloat(elementStr));
    } catch (Exception e) {
      return Optional.empty();
    }
  }

  static abstract class Element {
  }

  @Data
  static class Operation extends Element {
    private final BiFunction<Float, Float, Float> operation;
  }

  @Data
  static class Value extends Element {
    private final Float value;
  }

  static class InvalidElement extends Element {
  }
}