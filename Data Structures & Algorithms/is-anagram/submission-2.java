class Solution {
    public boolean isAnagram(String s, String t) {
    //  if(s.length()!=t.length()){
    //     return false;
    //  }
    //  HashMap<Character,Integer> map1=new HashMap<>();
    //  HashMap<Character,Integer> map2=new HashMap<>();
    //  for(int i=0;i<s.length();i++){
    //     map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
    //  }
    //  for(int i=0;i<t.length();i++){
    //     map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
    //  }
    //  return map1.equals(map2);
    //  if(s.length()!=t.length()){
    //     return false;
    //  }
    //  HashMap<Character,Integer> map1=new HashMap<>();
    //  for(int i=0;i<s.length();i++){
    //     map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
    //  }
    //  for(int i=0;i<t.length();i++){
    //     char ch=t.charAt(i);
    //     if(!map1.containsKey(ch)){
    //         return false;
    //     }
    //     else{
    //         //map1.put(ch,map1.getOrDefault(ch,0)-1);
    //         map1.computeIfPresent(ch,(key,value)->{
    //             if(value==1){
    //                 return null;
    //             }
    //             else{
    //                 return value-1;
    //             }
    //         });
    //     }
    //  }
    //  return map1.isEmpty();
    int[] arr=new int[26];
    if(s.length()!=t.length()){
        return false;
     }
     for(int i=0;i<s.length();i++){
        arr[s.charAt(i)-'a']++;
        arr[t.charAt(i)-'a']--;

     }
     for(int num:arr){
        if(num!=0){
            return false;
        }
     }
     return true;
    }
}
