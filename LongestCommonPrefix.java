/*

Given the array of strings A,
you need to find the longest string S which is the prefix of ALL the strings in the array.

Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1
and S2.

For Example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".

*/

public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        
        if (A.size() == 0)
            return "";
            
        if (A.size() == 1)
            return A.get(0);
        
        int min = Integer.MAX_VALUE;    
        for (String str : A) {
            if ((str == null) || (str.length() == 0))
                return "";
            if (str.length() < min)
                min = str.length();
        }
                
        int indx = -1;
        boolean check = true;
        while (check) {
            indx++;
            if (indx == min)
                break;
            char c = A.get(0).charAt(indx);
            for (int i=1; i < A.size(); i++) {
                if (A.get(i).charAt(indx) != c) {
                    check = false;
                    break;
                }
            }
        }
        
        return A.get(0).substring(0, indx);
    }
}

