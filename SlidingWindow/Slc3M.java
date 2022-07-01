// import java.util.Arrays;
public class Slc3M {
    public static void main(String[] args) {
        String input = "abcabcbb";
        // String input = "abcdefghigklmn";        
        int ans = lengthOfLongestSubstring(input);
        System.out.println(ans);
    }

    public static int lengthOfLongestSubstring(String s) { 
        int[] ans = new int[128];
        int left = 0;
        int res = 0;

        for(int i = 0; i < s.length(); i++) {
            char r = s.charAt(i);
            ans[r]++;

            while(ans[r] > 1) {
                char l = s.charAt(left);
                ans[l]--;
                left++;
            }
            res = Math.max(res,i-left+1);
        }
        return res;
    }
}
