package substring_343_hw5;
//-----------------------------------------------------
//Title: BruteForce
//Author:Alperen Aslan
//Definition : This class is implemented from book.
import java.util.Arrays;

public class BruteForce {

    // return the longest common prefix of s and t
    public static String lcp(String s, String t) {
        int n = Math.min(s.length(), t.length());
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != t.charAt(i))
                return s.substring(0, i);
        }
        return s.substring(0, n);
    }


    // return the longest repeated string in s
    public static String lrs(String s) {

        // form the N suffixes
        int N  = s.length();
        String lrs ="";
        for(int i=0;i<N;i++) 
        	for(int j=i+1;j<N;j++) {
        		String x = lcp(s.substring(i,N),s.substring(j,N));
        		if(x.length()>lrs.length()) lrs=x;
        	}
        	 return lrs;
        }
    

}