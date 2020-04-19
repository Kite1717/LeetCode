class Solution {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Greatest Common Divisor of Strings.
Memory Usage: 37.8 MB, less than 100.00% of Java online submissions for Greatest Common Divisor of Strings.
*/
     public String gcdOfStrings(String str1, String str2) {
    	if (str1.length() < str2.length())
    		return gcdOfStrings(str2, str1);
    	
    	if (str2.length()==0)
    		return str1;
    	
    	if (str1.startsWith(str2)) {
    		str1 = str1.substring(str2.length());
    		return gcdOfStrings(str1, str2);
    	}else
    		return "";
    }
}