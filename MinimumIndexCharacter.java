//https://practice.geeksforgeeks.org/problems/minimum-indexed-character-1587115620/1

class solve{

    public static int minIndexChar(String str, String pat){
        // Your code here
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0;i<pat.length();i++){
            set.add(pat.charAt(i));
        }
        for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(set.contains(ch))
                    return i;
        }
            return -1;
    }
}
