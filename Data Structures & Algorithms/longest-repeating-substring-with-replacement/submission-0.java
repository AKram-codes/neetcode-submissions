class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0, maxlen = 0, maxFreq = 0;

        for ( int r = 0; r < s.length(); r++){
            count[s.charAt(r)-'A']++;

            maxFreq = Math.max(maxFreq,count[s.charAt(r)-'A']);

            while((r - left +1)-maxFreq >k){
                count[s.charAt(left)-'A']--;
                left++;
            }
            maxlen = Math.max(maxlen,r-left + 1);
        }
        return maxlen;
    }
}
