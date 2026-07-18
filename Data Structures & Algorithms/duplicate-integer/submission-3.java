class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<nums.length;i++){
         if(set.contains(nums[i])){
            return true;
         }
         else{
            set.add(nums[i]);
         }
       }
       return false;

        // for(int i=0;i<nums.length;i++){
        //     int num=nums[i];
        //     for(int j=i+1;j<nums.length;j++){
        //        if(nums[j]==num){
        //         return true;
        //        } 
        //     }
        // }
        // return false;
    }
}