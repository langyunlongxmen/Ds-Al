public class Slc283 {
    public void moveZeroes(int[] nums) {
        int slow = 0, n = nums.length;
        
        for (int i = 0; i<n; i++) {

            if(nums[i] != 0) {
                int temp = nums[slow];
                nums[slow] = nums[i];
                nums[i] = temp;
                slow ++;
            }
        }
    }
}
