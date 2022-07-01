public class Slc485E {
    //Max Consecutive Ones
    public static void main(String[] args) {
        int[] input = {1,1,0,1,1,1};
        int ans = findMaxConsecutiveOnes(input);
        System.out.println(ans);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int len = 0; // store the length of consecutive 1

        for(int i = 0; i<nums.length; i++) {
            int num = nums[i];
            if(num == 1) {
                len++;
            } else {
                len = 0;
            }
            ans = Math.max(ans,len);
        }
        return ans;
    }
}
