class Solution {
    public boolean isAnagram(String s, String t) {
        int startChar = 'a';
        if(s.length() != t.length()) return false;
        int[] alphabetCountArray = new int[26];
        for(char c : s.toCharArray()){
            alphabetCountArray[c - startChar]++;
        }
        for(char c : t.toCharArray()){
            alphabetCountArray[c - startChar]--;
            if(alphabetCountArray[c - startChar] < 0) return false;
        }
        return true;
    }
}
