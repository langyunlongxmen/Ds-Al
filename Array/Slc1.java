import java.util.HashMap;
import java.util.Map;

public class Slc1 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        Map<Integer, Integer> map= new HashMap<>();
        
        for(int i = 0; i<n; i++) {
            int temp = target - nums[i];
            if(map.containsKey(temp)) {
                return new int[] {i,map.get(temp)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
