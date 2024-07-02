package elementary;

import java.util.Arrays;

/**
 <p>
    Problem - https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1
 </p>

 <div class="problems_problem_content__Xm_eO"><p>Given two integers a and b, write a function <code>lcmAndGcd()</code> to compute their LCM and GCD. The function takes two integers a and b as input and returns a list containing their LCM and GCD.</p>
 <p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
 <pre><span style="font-size: 18px;"><strong>Input: </strong>a = 5 , b = 10</span>
 <span style="font-size: 18px;"><strong>Output: </strong></span><span style="font-size: 18px;">10 5</span>
 <span style="font-size: 18px;"><strong>Explanation: </strong></span><span style="font-size: 18px;">LCM of 5 and 10 is 10, while thier GCD is 5.</span></pre>
 <pre><span style="font-size: 18px;"><strong>Input: </strong>a = 14 , b = 8</span>
 <span style="font-size: 18px;"><strong>Output: </strong></span><span style="font-size: 18px;">56 2</span>
 <span style="font-size: 18px;"><strong>Explanation: </strong></span><span style="font-size: 18px;">LCM of 14 and 8 is 56, while thier GCD is 2.</span></pre>
 <p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(log(min(a, b))</span><br><span style="font-size: 18px;"><strong>Expected Auxiliary Space:</strong> O(1)</span></p>
 <p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1 &lt;= a, b &lt;= 10<sup>9</sup></span></p></div>
 */
public class LCMAndGCD {
    public static void main(String[] args) {
        Arrays.stream(lcmAndGcd(5, 10)).forEach(System.out::println);
        Arrays.stream(lcmAndGcd(14, 8)).forEach(System.out::println);
    }

    static int[] lcmAndGcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        // lcm
        int lcm = -1;
        if (a % b == 0)
            lcm = a;
        else {
            for (int i = 2; i <= b; i++) {
                System.out.println(a + " * " + i + " = " + a * i + " | " + a + " * " + i + " % " + b + " = " + a*i%b);
                if (a * i % b == 0) { lcm = a * i; break;};
            }
        }

        // gcd
        return new int[]{lcm};
    }
}
