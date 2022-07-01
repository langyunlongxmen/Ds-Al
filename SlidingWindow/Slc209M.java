public class Slc209M {
    // Minimum Size Subarray Sum
    public static void main(String[] args) {
        int[] input = {2,3,1,2,4,3};
        int target = 7;
        int ans = minSubArrayLen(target, input);
        System.out.println(ans);
        System.out.println(input.length);
    }
    // for this question, there are two requirements:
    // 1. the minimum length
    // 2. the SUM of subarray should be >= target value
    public static int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE; // initial the minimum value with Integer.MAX_VALUE
        int left = 0;  // initial the left index
        int sum = 0;   // initial the sum value, which is used to comparing with the target value
        for(int right = 0; right < nums.length; right++) { // right index =0 and should be less than the nums array length
            sum += nums[right];  // update SUM of subarray with nums[right]
            while(sum>=target) {  // if satisfied the 2nd requirement, get into the while loop
                ans = Math.min(ans, right-left+1);  //if satisfied the 2nd requirement, calculate the minimum size of subarray
                sum -= nums[left];  // after find the minimum size, the SUM of subarray update
                left++;  // left index update
            }
        }
        return ans != Integer.MAX_VALUE ? ans : 0; // If all elements in array are same, the result should be 0
    }
    
}
