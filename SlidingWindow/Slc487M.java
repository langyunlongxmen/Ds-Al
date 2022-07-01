public class Slc487M {
    // Max Consecutive Ones II
    // Given a binary array nums, return the maximum number of consecutive 1's in the array if you can flip at most one 0.
    public static void main(String[] args) {
        int[] input = {1,0,1,1,0};
        int ans = findMaxConsecutiveOnes(input);
        System.out.println(ans);
    }
    
    public static int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int left = 0;
        int lenZero = 0;
        for(int right = 0; right < nums.length; right++) {
            int num = nums[right];
            if(num == 0) {
                lenZero++;
            }
            while(lenZero > 1) {
                if(nums[left] == 0) {
                    lenZero--;
                }
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}
