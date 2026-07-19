class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=2*nums.length;
        int[] arr=new int[n];
        // int j=0;
        // for(int i=0;i<n;i++){
        //     if(j==nums.length){
        //         j=0;
        //     }
        //     arr[i]=nums[j];
        //     j++;
        // }
        //int j=0;
        // for(int i=nums.length;i<n;i++){
        //     arr[i]=nums[j];
        //     j++;
        // }
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[nums.length+i]=nums[i];
        }
         return arr;
    }
}