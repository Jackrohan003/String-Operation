/*

You are given a string s containing lowercase English letters, and a matrix shift, where shift[i] = [direction, amount]:

direction can be 0 (for left shift) or 1 (for right shift). 
amount is the amount by which string s is to be shifted.
A left shift by 1 means remove the first character of s and append it to the end.
Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.

Example 1:

Input: s = "abc", shift = [[0,1],[1,2]]
Output: "cab"
Explanation: 
[0,1] means shift to left by 1. "abc" -> "bca"
[1,2] means shift to right by 2. "bca" -> "cab"

Example 2:

Input: s = "abcdefg", shift = [[1,1],[1,1],[0,2],[1,3]]
Output: "efgabcd"
Explanation:  
[1,1] means shift to right by 1. "abcdefg" -> "gabcdef"
[1,1] means shift to right by 1. "gabcdef" -> "fgabcde"
[0,2] means shift to left by 2. "fgabcde" -> "abcdefg"
[1,3] means shift to right by 3. "abcdefg" -> "efgabcd"

*/

class Solution {
    public String stringShift(String s, int[][] shift) {
        
        if(s.length()<=1)
            return s;
        
        int left = 0;
        int right =0;
        String result ="";
        
        for(int v[] :shift)
        {
            if(v[0]==0)
                left+=v[1];
            else
                right+=v[1];
        }
        
        if(left>right)
        {
            left-=right;
            left%=s.length();

            result+=s.substring(left);
            result+=s.substring(0,left);
        }
        else
        {
            right-=left;
            right%=s.length();

            result+=s.substring(s.length()-right);
            result+=s.substring(0,s.length()-right);
        }
        
        return result;         
    }
}
