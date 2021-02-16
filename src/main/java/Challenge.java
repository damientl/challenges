import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Challenge {

  public static String MinWindowSubstring(String[] strArr) {

    final var N = strArr[0];
    final var K = strArr[1];
    var j = 0;

    if (K.length() == 0
        || N.length() == 0) {
      return "";
    }

    var solutions = new HashSet<Solution>();

    final var notUsedKTemplate = (LinkedList<String>) IntStream
        .range(0, K.length())
        .mapToObj(i -> K.substring(i, i+1))
        .collect(Collectors.toCollection((Supplier<LinkedList>) LinkedList::new));
    LinkedList<String> notUsedK;

    var cursor = "";
    for (int i = 0; i < N.length(); i++) {
      j = i;
      notUsedK = (LinkedList<String>) notUsedKTemplate.clone();
      while (j < N.length()) {
        cursor = N.substring(j, j+1);
        if (notUsedK.contains(cursor)
        ) {
          notUsedK.remove(cursor);

          if (notUsedK.size() == 0) {
            solutions.add(new Solution(i, j+1, j - i));
            break;
          }
        }
        j++;
      }
    }

    return solutions.stream()
        .min(Comparator.comparingInt(Solution::getLength))
        .map(e -> N.substring(e.start, e.end))
        .orElse("");
  }

  static class Solution {
    private final Integer start;
    private final Integer end;
    private final Integer length;

    public Solution(Integer start, Integer end, Integer length) {
      this.start = start;
      this.end = end;
      this.length = length;
    }

    public Integer getStart() {
      return start;
    }

    public Integer getEnd() {
      return end;
    }

    public Integer getLength() {
      return length;
    }
  }
}
