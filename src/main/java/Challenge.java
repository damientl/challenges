class Challenge {

  public static String numberToOrdinal(Integer number) {
    if (number == 0) {
      return "" + number;
    }

    Integer teenNumber = number % 100;
    if (teenNumber > 10 && teenNumber < 14) {
      return number + "th";
    }

    if (number > 10000) {
      throw new IllegalArgumentException("Maximum allowed number is 10000.");
    }

    return number + getOrdinalSuffix(number % 10);
  }

  private static String getOrdinalSuffix(int number) {
    switch (number) {
      case 1:
        return "st";
      case 2:
        return "nd";
      case 3:
        return "rd";
      default:
        return "th";
    }
  }
}