class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false;
		
        int[] arr1 = new int[26], arr2 = new int[26];
        for (char c: s1.toCharArray()) arr1[c - 'a']++;
		
        for (int i = 0; i < len2; i++) {
            arr2[s2.charAt(i) - 'a']++;
            if (i >= len1) arr2[s2.charAt(i - len1) - 'a']--;
            if (Arrays.equals(arr1, arr2)) return true;
        }
        return false;
    }
}
