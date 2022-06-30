import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        int[] ans = findDiagonalOrder(input);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findDiagonalOrder(int[][] mat) {
        // Check for empty matrices
        if (mat == null || mat.length == 0) {
            return new int[0];
        }
        
        // Variables to track the size of the matrix
        int n = mat.length;
        int m = mat[0].length;
        // initial the result as int[]
        int[] result = new int[n*m];
        int idx = 0; //index for the result array
        ArrayList<Integer> interalList = new ArrayList<>(); //initial the interalList for storing the diagonal list 
        
        
        for(int d = 0; d < m + n - 1; d++){ // there are (m-1)+(n-1) scenarios
            
            int r = d < m ? 0 : d-m+1; // set row value, d-(m-1)
            int c = d < m ? d : m-1; // set column value, d or m-1; d is one variable
            interalList.clear(); // remove all the elements from a list;
            
            while(r < n && c > -1){ // checking all possible diagonal value
                interalList.add(mat[r][c]);
                r++; // r++ , c-- will guarantee the diagonal direction
                c--;                
            }
            
            if(d%2==0) { // for even value, we need to reverse the Arraylist direction
                Collections.reverse(interalList);
            }
            // update the result,
            for (int i=0; i<interalList.size(); i++) { 
                result[idx] = interalList.get(i);
                idx++;
              
            }
        }
        return result;   
    }
}