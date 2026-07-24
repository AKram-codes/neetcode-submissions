class Solution {
    public boolean hasDuplicate(int[] arr) {
        int n = arr.length;
        Set<Integer> mp = new HashSet<>();
        for(int i = 0 ; i < n ;i++){
            //mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
            if(mp.contains(arr[i])) return true;
            mp.add(arr[i]);
        }
        return false;
    }
}