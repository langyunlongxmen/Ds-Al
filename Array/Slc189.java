public class Slc189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reversed(nums, 0, n-1);
        reversed(nums, 0, k-1);
        reversed(nums, k, n-1);
    }
    
    public int[] reversed(int[] nums, int l, int r) {
        while(l<r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        return nums;
    }
}
