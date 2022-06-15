import java.util.*;
public class Slc268 {
    public int missingNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num:nums) numSet.add(num);
        
        int expectedNumCount = nums.length + 1;
        for(int i = 0; i<expectedNumCount; i++) {
            if (!numSet.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
