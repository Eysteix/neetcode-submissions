class Solution {
    public boolean hasDuplicate(int[] nums) {
         
        ArrayList<Integer> hashSet = new ArrayList<Integer>();

        for(int i = 0 ; i < nums.length; i++){
            if (hashSet.contains(nums[i])){
                return true;
            }
                hashSet.add(nums[i]);
        }
         return false;
    }

}