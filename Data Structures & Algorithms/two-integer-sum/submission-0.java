class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        int[] returnArray = new int[2];
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int rem = target - num;
            if(indexMap.containsKey(rem)) {
                returnArray[0] = indexMap.get(rem);
                returnArray[1] = i;
                return returnArray;
            }
            indexMap.put(num, i);
        }
        return returnArray;
    }
}
