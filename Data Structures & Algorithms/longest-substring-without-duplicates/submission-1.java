class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int start=0;int maxcount=0;
        for(int end=0;end<s.length();end++){
            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
            maxcount=Math.max(maxcount,end-start+1);
        }
         return maxcount;
    }
}
