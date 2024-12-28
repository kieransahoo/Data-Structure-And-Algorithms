
## Java
```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int value = target - nums[i];
            if (map.containsKey(value)) {
                return new int[] { map.get(value), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};

    }
}

```
