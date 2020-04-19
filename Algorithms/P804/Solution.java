class Solution {
    /*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Unique Morse Code Words.
Memory Usage: 35.6 MB, less than 100.00% of Java online submissions for Unique Morse Code Words.
*/
    private static final  String [] alphabet = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {

        HashSet<String> set = new HashSet<>();
        for(String s : words)
         set.add(morseConverter(s));
        return set.size();
    }

    private String morseConverter(String s)
    {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
             for(char ch : chars)
                 sb.append(alphabet[ch - 97 ]);
         return sb.toString();
    }
}