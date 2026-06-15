class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        //making the countMap
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int num : nums) {
            countMap.put(num, countMap.getOrDefault(num,0)+1);
        }

        //filling buckets -> frequency buckets
        List<Integer>[] buckets = new List[nums.length + 1];
        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            if(buckets[freq] == null) buckets[freq] = new ArrayList<>();
            buckets[freq].add(num);
        }

        //fetching the top k
        int[] result = new int[k];
        int index = 0;
        for(int freq = nums.length; freq >= 1 && index < k; freq--){
            if(buckets[freq] != null){
                for (int num: buckets[freq]) {
                    result[index++] = num;
                    if (index == k) break;
                }
            }
        }

        return result;
    }
}
