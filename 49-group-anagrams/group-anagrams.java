class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String , List<String>> m=new HashMap();

        for(String s:strs){
            int[]fre=new int[26];
            for(char ch:s.toCharArray()){
                fre[ch-'a']++;
            }
            String key=Arrays.toString(fre);

            if(!m.containsKey(key)){
                m.put(key,new ArrayList());
            }

            m.get(key).add(s);
        }

        return new ArrayList<>(m.values());
        
    }
}
