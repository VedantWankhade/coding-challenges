package stringsarrays;

/**
 <p>
    Problem - https://www.geeksforgeeks.org/problems/predict-the-column-java/1
 </p>

 <div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a matrix(2D array) <strong>M </strong>of size <strong>N</strong>*<strong>N</strong> consisting of <strong>0s</strong> and <strong>1s</strong> only. The task is to find the column with maximum number of <strong>0s</strong>.</span></p>

 <p><strong><span style="font-size:18px">Example 1:</span></strong></p>

 <pre><span style="font-size:18px"><strong>Input:</strong>
 3
 1 1 0
 1 1 0
 1 1 0</span>

 <strong><span style="font-size:18px">Output:</span></strong>
 <span style="font-size:18px">2</span>

 <span style="font-size:18px"><strong>Explanation:
 </strong>2nd column (0-based indexing) is having 3 zeros which is maximum.
 </span></pre>

 <p><strong><span style="font-size:18px">Example 2:</span></strong></p>

 <pre><span style="font-size:18px"><strong>Input:</strong>
 3
 0 1 0
 0 0 1
 0 1 0</span>

 <strong><span style="font-size:18px">Output:</span></strong>
 <span style="font-size:18px">0</span>

 <span style="font-size:18px"><strong>Explanation:
 </strong>0th column (0-based indexing) is having 3 zeros which is maximum.</span>

 <span style="font-size:18px"><strong>Constraints:</strong>
 1 &lt;= N &lt;= 10<sup>2</sup>
 0 &lt;= A[i][j] &lt;= 1</span></pre>

 <p><span style="font-size:18px"><strong>User Task:</strong><br>
 Your task is to complete the function <strong>columnWithMaxZero</strong>() which should return the column number with maximum number of zeros. If more than one column exists, print the one which comes first.</span><br>
 &nbsp;</p>
 </div>
 */
public class PredictTheColumn {
    public static void main(String[] args) {
        System.out.println(columnWithMaxZero(new int[][]{
                {1, 1, 0},
                {1, 1, 0},
                {1, 1, 0}
        }, 3));
        System.out.println(columnWithMaxZero(new int[][]{
                {0, 1, 0},
                {0, 0, 1},
                {0, 1, 0}
        }, 3));
    }

    static int columnWithMaxZero(int a[][],int n){
        int max = 0;
        int maxIndex = -1;
        for (int i = 0; i < a[0].length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++)
                if (a[j][i] == 0) count++;
            if (count > max) {
                maxIndex = i;
                max = count;
            }
        }
        return maxIndex;
    }
}
