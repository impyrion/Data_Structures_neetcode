class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<>();

        for(int i=0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        
        for(int i = 0; i < nums.length; i++){
            int lookupNumber = target - nums[i];

            if(map.containsKey(lookupNumber) && map.get(lookupNumber)!=i)
            {
                return new int[]{
                    Math.min(i, map.get(lookupNumber)), Math.max(i, map.get(lookupNumber))
                };
            }
        }
        return new int[] {-1,-1};
    }
    
}
