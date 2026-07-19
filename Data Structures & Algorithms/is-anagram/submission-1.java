class Solution {
    public boolean isAnagram(String s, String t) {
     if(s.length()!=t.length()){
        return false;
     }
     HashMap<Character,Integer> map1=new HashMap<>();
     for(int i=0;i<s.length();i++){
        map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
     }
     for(int i=0;i<t.length();i++){
        char ch=t.charAt(i);
        if(!map1.containsKey(ch)){
            return false;
        }
        else{
            //map1.put(ch,map1.getOrDefault(ch,0)-1);
            map1.computeIfPresent(ch,(key,value)->{
                if(value==1){
                    return null;
                }
                else{
                    return value-1;
                }
            });
        }
     }
     return map1.isEmpty();
    }
}
