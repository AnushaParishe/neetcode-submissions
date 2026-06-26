class Solution {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);
        // int count=0,maxCount=0;
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i+1]-nums[i]==1){
        //         count++;
        //     }
        //         if(maxCount<count){
        //             maxCount=count;
        //         }
            
        // }
        //return maxCount+1;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int ans=0;
        for(int i : nums){
            int starting=0,longest=i;
            while(set.contains(longest)){
                starting++;
                longest++;
            }
            ans=Math.max(ans,starting);
        }
        
return ans;
    }
}
