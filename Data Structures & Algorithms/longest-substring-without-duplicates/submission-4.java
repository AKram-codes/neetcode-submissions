class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        Set<Character> seen = new HashSet<>();
        int l = 0, r = 0, maxL = 0;

        while(r < s.length()){
            char c = s.charAt(r);

            while(seen.contains(c) && l < s.length()){
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(c);
            maxL = Math.max(maxL, r-l+1);
            r++;
        }
        return maxL;
    }
}
