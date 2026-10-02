class Solution {
    public String longestCommonPrefix(String[] s) {

        String first=s[0];

        for(int i=0;i<first.length();i++){
            char ch=first.charAt(i);
            for(int j=1;j<s.length;j++){
                if(i>=s[j].length() || ch!=s[j].charAt(i)) return first.substring(0,i);
            }
        }
        return first;
        
    }
}