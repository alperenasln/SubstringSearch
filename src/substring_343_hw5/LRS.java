package substring_343_hw5;
//-----------------------------------------------------
//Title: LRS
//Author:Alperen Aslan
//Definition : This class is implemented from book.
import java.util.Arrays;

public class LRS {

    // Do not instantiate.
    LRS() { }

    public static  String lrs(String text) {
        int n = text.length();
        SuffixArray sa = new SuffixArray(text);
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
