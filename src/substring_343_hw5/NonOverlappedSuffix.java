package substring_343_hw5;
//-----------------------------------------------------
//Title: Driver1
//Author:Alperen Aslan
//Definition : This class is implemented from book. There are additional function in line 53 and line 62 
public class NonOverlappedSuffix {
	// Returns the longest repeating non-overlapping
	// substring in str
	static String longestRepeatedSubstring(String str) {
		int n = str.length();
		int LCSRe[][] = new int[n + 1][n + 1];

		String res = ""; // To store result
		int res_length = 0; // To store length of result

		// building table in bottom-up manner
		int i, index = 0;
		for (i = 1; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				// (j-i) > LCSRe[i-1][j-1] to remove
				// overlapping
				if (str.charAt(i - 1) == str.charAt(j - 1) && LCSRe[i - 1][j - 1] < (j - i)) {
					LCSRe[i][j] = LCSRe[i - 1][j - 1] + 1;

					// updating maximum length of the
					// substring and updating the finishing
					// index of the suffix
					if (LCSRe[i][j] > res_length) {
						res_length = LCSRe[i][j];
						index = Math.max(i, index);
					}
				} else {
					LCSRe[i][j] = 0;
				}
			}
		}

		// If we have non-empty result, then insert all
		// characters from first character to last
		// character of String
		if (res_length > 0) {
			for (i = index - res_length + 1; i <= index; i++) {
				res += str.charAt(i - 1);
			}
		}

		return res;
	}
	
	public static void skipthat(String pattern, String txt) {
		// Calls the reverseString method, substrings the strings and prints the first 8 index.
		String text = reverseString(txt);
		String pat = reverseString(pattern);
		String tet = txt.substring(text.indexOf(pat), txt.length());
		String xtet = tet + tet;
		System.out.println(xtet.substring(0, 8) + "...");
	}

	public static String reverseString(String str) {
		//Reverses the string.
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
}
