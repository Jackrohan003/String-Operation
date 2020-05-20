class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

           List<List<String>> group = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(String str : strs)
        {
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            
            if(map.containsKey(sorted)==false)
                map.put(sorted,new ArrayList<>());
            map.get(sorted).add(str);
        }
        group.addAll(map.values());
        
        return group;
        
        
        
    }
}
