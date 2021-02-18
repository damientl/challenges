class CreditCard {

  public static String maskify(String creditCardNumber) {
    if (creditCardNumber.length() < 6) {
      return creditCardNumber;
    }

    return creditCardNumber.charAt(0)
        + replaceDigits(creditCardNumber.substring(1, creditCardNumber.length() - 4))
        + creditCardNumber.substring(creditCardNumber.length() - 4);
  }

  private static String replaceDigits(final String text) {
    return text.replaceAll("\\d", "#");
  }
}
