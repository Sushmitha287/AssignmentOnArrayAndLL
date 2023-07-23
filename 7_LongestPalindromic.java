class Solution {
	private int lon, maxLength;
    public String longestPalindrome(String s) {
        int len = s.length();
	if (len < 2)
		return s;
	
    for (int i = 0; i < len-1; i++) {
     	extendPalindromeLen(s, i, i);  
     	extendPalindromeLen(s, i, i+1); 
    }
    return s.substring(lon, lon + maxLength);
    }

private void extendPalindromeLen(String s, int j, int k) {
	while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
		j--;
		k++;
	}
	if (maxLength < k - j - 1) {
		lo = j + 1;
		maxLength = k - j - 1;
	}
}
}
