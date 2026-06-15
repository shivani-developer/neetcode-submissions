class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs){
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String encoded) {
        List<String> strs = new ArrayList<>();
        int i = 0;
        while(i < encoded.length()){
            //find the length before the hash
            int start = i;
            while(encoded.charAt(i) != '#'){
                i++;
            }
            int len = Integer.parseInt(encoded.substring(start, i));
            strs.add(encoded.substring(i+1, i+1+len));
            i = i+1+len;
        }
        return strs;
    }
}
