class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> alphabetCountMap = new HashMap<>();
        for(String str : strs){
            String countString = getAlphabetCount(str);
            alphabetCountMap.computeIfAbsent(countString, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(alphabetCountMap.values());
    }

    private String getAlphabetCount(String str){
        int startChar = 'a';
        int[] countArr = new int[26];
        for(char c : str.toCharArray()){
            countArr[c - startChar]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int count : countArr){
            sb.append(count);
            sb.append("_");
        }
        return sb.toString();
    }
}
