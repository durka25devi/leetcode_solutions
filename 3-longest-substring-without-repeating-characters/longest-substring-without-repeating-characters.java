class Solution {
    public int lengthOfLongestSubstring(String s) {
           HashSet<Character> set=new HashSet();
           int left=0;
           int maxx=0;

           for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(!set.contains(ch)){
                set.add(ch);
            }

            else{
                while(set.contains(ch)){
                    set.remove(s.charAt(left));
                    left++;
                }

                set.add(ch);
            }
            int length=right-left+1;
            maxx=Math.max(maxx,length);
           }

           return maxx;
        
    }
}