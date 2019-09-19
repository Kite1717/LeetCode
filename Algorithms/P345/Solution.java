class Solution {
    /*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse Vowels of a String.
Memory Usage: 37.6 MB, less than 100.00% of Java online submissions for Reverse Vowels of a String.
*/
    public String reverseVowels(String s) {

        boolean[] isVowelMap = new boolean[256];
        isVowelMap['a'] = true;
        isVowelMap['e'] = true;
        isVowelMap['i'] = true;
        isVowelMap['o'] = true;
        isVowelMap['u'] = true;
        isVowelMap['A'] = true;
        isVowelMap['E'] = true;
        isVowelMap['I'] = true;
        isVowelMap['O'] = true;
        isVowelMap['U'] = true;
        
        char [ ] arr = s.toCharArray();

        int left = 0 , right = arr.length -1 ;
        while (left < right)
        {
            
            if(!isVowelMap[arr[left]] || !isVowelMap[arr[right]])
            {
                if(!isVowelMap[arr[left]]) left ++;
                else  right --;
            }
            else if( isVowelMap[arr[left]] && isVowelMap[arr[right]])
            {

                arr[left] ^= arr[right];
                arr[right] ^= arr[left];
                arr[left] ^= arr[right];
                left ++ ; right --;

            }
            else {
                left ++ ; right --;
            }


        }
        return  new String(arr);
    }
}