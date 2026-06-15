class Solution {
    public int[] productExceptSelf(int[] nums) {
        //logic based on the followup
        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];
        int[] result = new int[nums.length];
        
        prefixProduct[0] = 1;
        suffixProduct[nums.length-1] = 1;
        for(int i = 1; i < nums.length; i++){
            prefixProduct[i] = prefixProduct[i-1] * nums[i-1];
            suffixProduct[nums.length-1-i] = suffixProduct[nums.length-i] * nums[nums.length-i];
        }
        for(int i = 0; i < nums.length; i++){
            result[i] = prefixProduct[i] * suffixProduct[i];
        }
        return result;
    }
}  
