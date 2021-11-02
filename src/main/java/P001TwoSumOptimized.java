import java.util.HashMap;

public class P001TwoSumOptimized {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> lookingForMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (lookingForMap.containsKey(nums[i])) {
                return new int[]{lookingForMap.get(nums[i]), i};
            } else {
                lookingForMap.put(target - nums[i], i);
            }
        }
        return new int[0];
    }
}
