import java.util.List;
import java.util.ArrayList;
// import java.util.Arrays;
public class M54 {
    public static void main(String[] args) {
        
        int[][] input = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> ans = spiralOrder(input);
        System.out.println(ans);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0, left = 0;
        int bot = row-1, right = col-1;
        while(ans.size() < row * col) {

            for(int c = left; c <= right; c++) {
                ans.add(matrix[top][c]);
            }

            for(int r = top+1; r <= bot; r++) {
                ans.add(matrix[r][right]);
            }

            if(top != bot) {
                for(int c = right-1; c >= left; c--) {
                    ans.add(matrix[bot][c]);
                }
            }


            if(left != right) {
                for(int r = bot-1; r > top; r--) {
                    ans.add(matrix[r][left]);
                }
            }

            top++;
            right--;
            bot--;
            left++;

        }
        return ans;
    }    
}
