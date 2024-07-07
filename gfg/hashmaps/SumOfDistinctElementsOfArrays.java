package gfg.hashmaps;

import java.util.*;

/**
 <p>Problem - https://www.geeksforgeeks.org/problems/sum-of-distinct-elements4801/1</p>
 <div class="problem-statement">
 <p></p><p><span style="font-size:18px">Given an array <strong>arr[]&nbsp;</strong>of size <strong>N</strong>, check if it is sorted in non-decreasing order or not.&nbsp;</span></p>
<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>
<pre><span style="font-size:18px"><strong>Input:
</strong>N = 5
arr[] = {10, 20, 30, 40, 50}
<strong>Output:</strong> 1
<strong>Explanation:</strong> The given array is sorted.
</span></pre>
<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>
<pre><span style="font-size:18px"><strong>Input:
</strong>N = 6
arr[] = {90, 80, 100, 70, 40, 30}
<strong>Output:</strong> 0
<strong>Explanation:</strong>&nbsp;The given array is not sorted.</span></pre>
<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>arraySortedOrNot()</strong>&nbsp;which takes the&nbsp;<strong>arr[]&nbsp;</strong>and N<strong>&nbsp;</strong>as input parameters and returns a <strong>boolean</strong> value (true if it is sorted otherwise false).</span></p>
<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>
<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>5</sup><br>
1 ≤ Arr[i] ≤ 10<sup>6</sup></span></p>
<p>&nbsp;</p>
 <p></p>
 </div>
 */
public class SumOfDistinctElementsOfArrays {
    public static void main(String[] args){
        System.out.println(countDistinct(new int[]{1, 2, 3, 4, 5}));
        System.out.println(countDistinct(new int[]{5, 5, 5, 5, 5}));
        System.out.println(countDistinct(new int[]{5, 2, 4, 5, 4}));
        System.out.println(countDistinctWithHashMap(new int[]{1, 2, 3, 4, 5}));
        System.out.println(countDistinctWithHashMap(new int[]{5, 5, 5, 5, 5}));
        System.out.println(countDistinctWithHashMap(new int[]{5, 2, 4, 5, 4}));
    }

    private static int countDistinct(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i: arr) {
            set.add(i);
        }
        int sum = 0;
        for (int i: set) {
            sum += i;
        }
        return sum;
    }

    private static int countDistinctWithHashMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            }
        }
        int res = 0;
        for (int k: map.keySet()) {
            res += k;
        }
        return res;
    }
}