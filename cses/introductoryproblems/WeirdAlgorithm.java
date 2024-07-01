package introductoryproblems;

import java.util.Scanner;

/**
 <p>
 Problem - https://cses.fi/problemset/task/1068
 </p>
 <p>
 Time limit: 1.00 s
 Memory limit: 512 MB
 </p>
 <p>
 Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one.
 The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
 </p>
 <p>
 3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 </p>
 <p>
 Your task is to simulate the execution of the algorithm for a given value of n.
 </p>
 <p>
 Input:
 The only input line contains an integer n.
 </p>
 <p>
 Output:
 Print a line that contains all values of n during the algorithm.
 </p>
 <p>
 Constraints:
 1 <= n <= 10^6
</p>
 <p>
 Example
 </p>
 <p></p>
 Input:
 3
    </p>
 <p>
 Output:
 3 10 5 16 8 4 2 1
 </p>
 */
public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        weirdAlgorithm(n);
    }

    private static void weirdAlgorithm(long n) {
        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }
        System.out.print(n);
    }
}
