class Solution {
    public boolean isPalindrome(String s) {
      String cleanedText = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       int start=0;
       int end=cleanedText.length()-1;
       while(start<=end){
           if(cleanedText.charAt(start)!=cleanedText.charAt(end)){
              return false;
           }
           start++;
           end--;
       }
       return true;
    }
}
