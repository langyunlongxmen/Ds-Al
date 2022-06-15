// import java.util.List;
public class Slc977 {

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int l = 0, r = n-1, p = n-1;

        while(l<=r) {
            int val_l = nums[l]*nums[l];
            int val_r = nums[r]*nums[r];

            if(val_l>=val_r) {
                result[p] = val_l;
                l++;
                p--;
            } else {
                result[p] = val_r;
                r--;
                p--;
            }
        }
        return result;

    }
  
}
