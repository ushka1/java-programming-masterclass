public class V3_OtherTypes {
  public static void main(String[] args) {
    // 16 bits, can contain unicode characters
    char c1 = 'D';

    // https://unicode-table.com/en/
    char c2 = '\u0044';

    boolean res = c1 == c2;
    if (res)
      System.err.println("\u00BB equal \u00AB");

    /*
     * not a primitive type like previous, it is a class in a fact
     * and that's why it starts with big letter
     *
     * techincally it is limeted by machine memory or Integer.MAX_VALUE
     *
     * strings are immutable so concat/insert/delete/etc... methods
     * create new strings instead of operating on currently existing ones
     */

    String str1 = "Ala has";
    String str2 = "a cat.";
    str1 += " " + str2;
    System.out.println(str1);

    String n1 = "100";
    int n2 = 100;
    System.out.println(n1 + n2);
  }
}
