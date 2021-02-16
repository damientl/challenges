import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class ChallengeTest {


  @Test
  public void shouldReturnMinString() {
    assertEquals("aksfaje",
        Challenge.MinWindowSubstring(new String[] {"ahffaksfajeeubsne", "jefaa"}));

    assertEquals("affhkkse",
        Challenge.MinWindowSubstring(new String[] {"aaffhkksemckelloe", "fhea"}));

    assertEquals("aabd",
        Challenge.MinWindowSubstring(new String[] {"aabdccdbcacd", "aad"}));

    assertEquals("aksfaje",
        Challenge.MinWindowSubstring(new String[] {"ahffaksfajeeubsne", "jefaa"}));

    assertEquals("affhkkse",
        Challenge.MinWindowSubstring(new String[] {"aaffhkksemckelloe", "fhea"}));

    assertEquals("a",
        Challenge.MinWindowSubstring(new String[] {"aaaaaaaaa", "a"}));

  }
}


/**
 1. For input new String[] {"aabdccdbcacd", "aad"} the output was incorrect. The correct output is aabd

 2. For input new String[] {"ahffaksfajeeubsne", "jefaa"} the output was incorrect. The correct output is aksfaje

 3. For input new String[] {"aaffhkksemckelloe", "fhea"} the output was incorrect. The correct output is affhkkse

 4. For input new String[] {"aaaaaaaaa", "a"} the output was incorrect. The correct output is a

 5. For input new String[] {"aaffsfsfasfasfasfasfasfacasfafe", "fafe"} the output was incorrect. The correct output is fafe

 6. For input new String[] {"aaffsfsfasfasfasfasfasfacasfafe", "fafsf"} the output was incorrect. The correct output is affsf

 7. For input new String[] {"vvavereveaevafefaef", "vvev"} the output was incorrect. The correct output is vvave

 8. For input new String[] {"caae", "cae"} the output was incorrect. The correct output is caae

 9. For input new String[] {"cccaabbbbrr", "rbac"} the output was incorrect. The correct output is caabbbbr
 */