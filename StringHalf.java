/*
You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
Example 2:

Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.

*/

class Solution {
    public boolean halvesAreAlike(String s) {
     
        if(s==null)
            return true;
        
        int first=0;
        int sec=0;
         
        String str = s.toLowerCase();
        int len =str.length();
        
        for(int i=0,j=len/2;i<len/2 && j<len ;i++,j++){
            
            char a= str.charAt(i);
            char b = str.charAt(j);
            
            if(a=='a' || a=='e' || a=='i' ||a=='o'||a=='u')
                first++;
            if(b=='a' || b=='e' || b=='i' ||b=='o'||b=='u')
                sec++;
        }
        if(first==sec)
            return true;
        else
            return false;
        
    }
}
