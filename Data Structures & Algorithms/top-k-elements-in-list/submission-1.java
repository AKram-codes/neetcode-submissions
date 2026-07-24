class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> fmap = new HashMap<>();
        for(int num : nums){
            fmap.put(num,fmap.getOrDefault(num,0)+1);
        }
        List<Integer>[] buckets = new List[nums.length+1];
        for(int key : fmap.keySet()){
            int freq = fmap.get(key);
            if(buckets[freq]== null)
                buckets[freq] = new ArrayList<>();
            buckets[freq].add(key);
        }
        List<Integer> res = new ArrayList<>();
        for(int i = buckets.length-1; i>=0 && res.size()<k;i--){
            if(buckets[i]!= null){
                res.addAll(buckets[i]);
            }
        }
        return res.stream().limit(k).mapToInt(Integer::intValue).toArray();
        }
}
