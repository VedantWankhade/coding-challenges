package hashmaps;

import java.util.HashMap;
import java.util.Map;

/**
 <p>
    Problem - https://www.geeksforgeeks.org/problems/count-the-specials-java/1
 </p>

 <div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an arry <strong>A</strong> (may contain duplicates) of <strong>N</strong> elements and a positive integer <strong>K</strong>. The task is to count the number of elements which occurs exactly <strong>floor(N/K)</strong> times in the array.</span></p>

 <p>&nbsp;</p>

 <p><strong><span style="font-size:18px">Example 1:</span></strong></p>

 <pre><span style="font-size:18px"><strong>Input:</strong>
 5 2
 1 4 1 2 4</span>
 <span style="font-size:18px"><strong>Output:</strong>
 2</span>
 <span style="font-size:18px"><strong>Explanation:
 </strong>In the given array, 1 and
 4 occurs floor(5/2) = 2
 times. So count is 2.</span></pre>

 <p><strong><span style="font-size:18px">Example 2:</span></strong></p>

 <pre><span style="font-size:18px"><strong>Input:</strong>
 3 2
 99 66 66 </span>
 <span style="font-size:18px"><strong>Output:</strong>
 1</span>
 <span style="font-size:18px"><strong>Explanation:
 </strong>In the given array, 99 occurs
 floor(3/2) = 1 time. So count
 is 1.</span></pre>

 <p><span style="font-size:18px"><strong>Your Task:</strong><br>
 You don't have to read input or print anything. Your task is to complete the function <strong>countSpecials</strong>() which takes <strong>arr[],n,k</strong> denoting the array, length of the array, and an integer and return an integer denoting the count of the elements which occurs exactly floor(N/K) times.</span></p>

 <p><span style="font-size:18px"><strong>Constrains:</strong><br>
 1 &lt;= N &lt;= 10<sup>3</sup><br>
 1 &lt;= A<sub>i</sub> &lt;= 10<sup>3</sup></span></p>

 <p>&nbsp;</p>
 </div>
 */
public class CountSpecials {
    public static void main(String[] args) {
        System.out.println(countSpecials(new int[]{1, 4, 1, 2, 4}, 5, 2));
        System.out.println(countSpecials(new int[]{9, 6, 6}, 3, 2));
    }

    static int countSpecials(int a[], int n, int k){
        int f = n/k;
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i: a) {
            hash.put(i, hash.getOrDefault(i, 0) + 1);
        }
        int count = 0;
        for (int v : hash.values()) {
            if (v == f) count++;
        }
        return count;
    }
}
