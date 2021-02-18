import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class ChallengeTest {

  @Test
  public void shouldMaskDigitsForBasicCreditCards() {
    assertEquals("5###########0694", CreditCard.maskify("5512103073210694"));
  }

  @Test
  public void shouldNotMaskDigitsForShortCreditCards() {
    assertEquals("54321", CreditCard.maskify("54321"));
  }

  @Test
  public void shouldNotMaskNonDigitChars() {
    assertEquals("4###-####-####-5616", CreditCard.maskify("4556-3646-0793-5616"));
  }

  @Test
  public void shouldMaskDigitsForBasicCreditCardsWithSmallerInput() {
    assertEquals("6######5616", CreditCard.maskify("64607935616"));
  }

  @Test
  public void shouldNotMaskNonDigitCharsWithLetterOnStart() {
    assertEquals("ABCD-EFGH-IJKLM-NOPQ", CreditCard.maskify("ABCD-EFGH-IJKLM-NOPQ"));
  }

  @Test
  public void shouldMaskDigitCharsIfInputLengthIs6() {
    assertEquals("1#3456", CreditCard.maskify("123456"));
  }

  @Test
  public void shouldNotMaskDigitCharsIfInputIsShort() {
    assertEquals("12345", CreditCard.maskify("12345"));
  }

  @Test
  public void shouldNotMaskEmptyString() {
    assertEquals("", CreditCard.maskify(""));
  }

  @Test
  public void shouldNotMaskShortLettersString() {
    assertEquals("Skippy", CreditCard.maskify("Skippy"));
  }

  /**
   * "4556364607935616"	"4###########5616"
   * "4556-3646-0793-5616"	"4###-####-####-5616"
   * "64607935616"	"6######5616"
   * ABCD-EFGH-IJKLM-NOPQ	ABCD-EFGH-IJKLM-NOPQ
   * A1234567BCDEFG89HI	A#######BCDEFG89HI
   * "12345"	"12345"	No #s if less than 6 characters
   * ""	""	Make sure to handle empty strings
   * "Skippy"	"Skippy"
   */
}
