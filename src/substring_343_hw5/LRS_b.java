package substring_343_hw5;
//-----------------------------------------------------
//Title: LRS_b
//Author:Alperen Aslan
//Definition : This class is a same thing with LRS which is implemented from book. Used for implementing SuffixArrayX.


public class LRS_b {

    // Do not instantiate.
    LRS_b() { }

    /**
     * Returns the longest common string of the two specified strings.
     *
     * @param  s one string
     * @param  t the other string
     * @return the longest common string that appears as a substring
     */

    /**
     * Returns the longest repeated substring of the specified string.
     *
     * @param  text the string
     * @return the longest repeated substring that appears in {@code text};
     *         the empty string if no such string
     */
    public static String lrs(String text) {
        int n = text.length();
        SuffixArrayX sa = new SuffixArrayX(text);
        String lrs = "";
        for (int i = 1; i < n; i++) {
            int length = sa.lcp(i);
            if (length > lrs.length()) {
                // lrs = sa.select(i).substring(0, length);
                lrs = text.substring(sa.index(i), sa.index(i) + length);
            }
        }
       return lrs;
    }

   
}
