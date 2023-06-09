package ui;

public final class Constantes {
    /** How do you say "yes"? */
  public final static String BOOLEAN_WORD_YES = "sim";

  /** How do you say "no"? */
  public final static String BOOLEAN_WORD_NO = "nao";

  /** How do you say "yes"? */
  public final static char BOOLEAN_CHAR_YES = 's';

  /** How do you say "no"? */
  public final static char BOOLEAN_CHAR_NO = 'n';

  /**
   * Expressão que considera os quatros casos de matricula em Portugal
   * LL-NN-NN
   * NN-NN-LL
   * NN-LL-NN
   * LL-NN-LL
   **/
  public final static String MATRICULA_REGEX="^(([A-Z]{2}-\\d{2}-(\\d{2}|[A-Z]{2}))|(\\d{2}-(\\d{2}-[A-Z]{2}|[A-Z]{2}-\\d{2})))?$";

  public final static String CC_REGEX="\\b\\d{8}\\b";

  public final static String NIF_REGEX="\\b\\d{9}\\b";

  public final static String EMAIL_REGEX="^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";

  public final static String ID3_REGEX="^[A-Z0-9]{3}?$";

  public final static String DATE_REGEX="\\d{4}-\\d{2}-\\d{2}";

  public final static String TIME_REGEX="^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$";
}