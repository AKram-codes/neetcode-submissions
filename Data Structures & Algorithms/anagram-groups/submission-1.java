class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for(char ch: s.toCharArray()){
                count[ch-'a']++;
            }
            String sorts = Arrays.toString(count);
            res.putIfAbsent(sorts,new ArrayList<>());
            res.get(sorts).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
