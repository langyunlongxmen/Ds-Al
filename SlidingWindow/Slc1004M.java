public class Slc1004M {
    //Max Consecutive Ones III
    //Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
    public static void main(String[] args) {
        int[] input = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        // int[] input2 = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1} k = 3
        int ans = longestOnes(input, k);
        System.out.println(ans);
    }

    public static int longestOnes(int[] nums, int k) {
        int ans = 0;
        int left = 0;
        int lenZero = 0;
        for(int right = 0; right < nums.length; right++) {
            int num = nums[right];
            if(num == 0) {
                lenZero++;
            }
            while(lenZero > k) {
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
