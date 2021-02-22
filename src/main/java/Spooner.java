import java.util.Arrays;

class Spooner {

  public static String sayHello(String name) {
    // You can print to STDOUT for debugging if you need to:
    System.out.print(name);

    // but you need to return the correct value in order to pass the challenge
    return "Hello, " + name + '!';
  }

  public String spoonerize(String words) {
    String[] wordsArr = words.split(" ");
    if (wordsArr.length != 2){
      throw new IllegalArgumentException("different from 2");
    }
    String first = wordsArr[1].charAt(0) + wordsArr[0].substring(1);
    String second = wordsArr[0].charAt(0) + wordsArr[1].substring(1);

    return first + " " + second;
  }
}
