class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int idx=0;
        int[] temp=new int[k]; 
        HashMap<Integer,Integer> map=new HashMap<>();
         for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        while(idx<k){
            int mfreq=0,maxnum=0;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
               if(entry.getValue() > mfreq){
                   mfreq=entry.getValue();
                   maxnum=entry.getKey();
                }
            }
            temp[idx]=maxnum;
            idx++;
            map.remove(maxnum);
        }
        return temp;
    }
}
