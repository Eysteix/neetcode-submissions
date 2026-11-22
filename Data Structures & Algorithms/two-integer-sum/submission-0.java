class Solution {
    public int[] twoSum(int[] nums, int target) {
           int[] output = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
              if(nums[i]+ nums[j] == target && i !=j){
                int max =i;
                int min = j;
             
                 if(i < j){
                  max = j;
                  min = i;
                 }
                 output[0]=min;
                 output[1]=max;
                 
              }
            }
        }
        return output;
    }
}
