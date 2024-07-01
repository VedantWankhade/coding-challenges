package introductoryproblems;

import java.util.Scanner;

/**
 <p>
    Problem - https://cses.fi/problemset/task/1083/
 </p>
 <p>
 Time limit: 1.00 s Memory limit: 512 MB
 </p>
 <p>
 You are given all numbers between 1,2,... ,n except one. Your task is to find the missing number.
 </p>
 <p>
 Input
 </p>
 <p>
 The first input line contains an integer n.
 </p>
 <p>
    The second line contains n-1 numbers. Each number is distinct and between 1 and n (inclusive).
 </p>
 <p>
 Output:
Print the missing number.
 </p>
 <p>
 Constraints:
2 <= n <= 2*10^5
 </p>
<p>
    Example
 </p>
 <p>
 Input:<br>
5<br>
2 3 1 5
 </p>
 <p>
 Output:
4
 </p>
 */
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n - 1];
        int i = 0;
        while (i < n - 1) {
           nums[i] = sc.nextInt();
           i++;
        }
        System.out.println(missingNumber(n, nums));
    }

    private static int missingNumber(int n, int[] nums) {
        long apSum = (long)n * (n + 1) / 2;
        long sum = 0;
        for (int num : nums) {
            sum += (long)num;
        }
        return (int)(apSum - sum);
    }
}
