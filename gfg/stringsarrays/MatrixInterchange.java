package stringsarrays;

/**
 <p>
    Problem - https://www.geeksforgeeks.org/problems/matrix-interchange-java/1
 </p>
 <div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Working with 2D arrays is quite important. Here we will do swapping of column in a 2D array. You are given a matrix M or r rows and c columns. You need to swap the first column with the last column.</span></p>

 <p><strong><span style="font-size:18px">Example:</span></strong></p>

 <pre><span style="font-size:18px"><strong>Input:</strong>
 3 4
 1 2 3 4
 4 3 2 1
 6 7 8 9

 <strong>Output:</strong>
 4 2 3 1
 1 3 2 4
 9 7 8 6</span></pre>

 <p><span style="font-size:18px"><strong>Your Task:</strong><br>
 Since this is a function problem, you don't need to take any input. Just complete the provided function <strong>interchange(int, int , int ) </strong>that take matrix, rows and columns as parameters.</span></p>

 <p><span style="font-size:18px"><strong>Constraints:</strong><br>
 1 &lt;= r,c &lt;= 100</span></p>
 </div>
 */
public class MatrixInterchange {
    public static void main(String[] args) {
        interchange(new int[][]{
            {1, 2, 3, 4},
            {4, 3, 2, 1},
            {6, 7, 8, 9},
        }, 3, 4);
    }

    static void interchange(int[][] a, int r, int c){

        // Your code here
        for (int i = 0; i < r; i++) {
            int[] row = a[i];
            int temp = row[0];
            row[0] = row[row.length - 1];
            row[row.length - 1] = temp;
        }

        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
