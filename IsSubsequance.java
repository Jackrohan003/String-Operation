class IsSubsequance {
    public boolean isSubsequence(String s, String t) {
    
        if(s.length()==0)return true;
            
        int sindex=0;
        
        for(int i = 0;i< t.length();i++)
        {
            if(t.charAt(i) == s.charAt(sindex))
                sindex++;
            
            if(sindex == s.length())
                return true;
        }
        return sindex == s.length();
    }
}
