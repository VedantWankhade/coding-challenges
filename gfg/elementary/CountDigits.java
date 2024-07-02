package elementary;

/**
 <p>
    Problem - https://www.geeksforgeeks.org/problems/count-digits5716/0
 </p>
 <div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a number <strong>n</strong>. Count the number of digits in <strong>n</strong> which evenly divide <strong>n</strong>. R</span><span style="font-size: 18px;">eturn an integer, total number of digits of n which divides n evenly.</span></p>
 <p><span style="font-size: 18px;"><strong>Note</strong> :- Evenly divides means whether <strong>n</strong> is divisible by a digit i.e. leaves a remainder 0 when divided.</span><br>&nbsp;</p>
 <p><strong><span style="font-size: 18px;">Examples :</span></strong></p>
 <pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">n = 12</span><strong><span style="font-size: 18px;">
 Output: </span></strong><span style="font-size: 18px;">2</span><strong><span style="font-size: 18px;">
 Explanation: </span></strong><span style="font-size: 18px;">1, 2 when both divide 12 leaves remainder 0.</span></pre>
 <pre><span style="font-size: 18px;"><strong>Input: </strong>n = 23<strong>
 Output </strong>0<strong>
 Explanation: </strong>2 and 3, none of them divide 23 evenly.
 </span></pre>
 <p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(log</span><span style="font-size: 15px;"> n</span><span style="font-size: 18px;">)</span><br><span style="font-size: 14pt;"><strong>Expected Space Complexity:</strong> O(1)</span><br>&nbsp;</p>
 <p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1&lt;= n &lt;=10<sup>5</sup></span></p></div>
 */
public class CountDigits {
    public static void main(String[] args) {
        System.out.println(evenlyDivides(23));
    }

    static int evenlyDivides(int N){
        int count = 0;
        int n = N;
        while (n > 0) {
            int dig = n % 10;
            n /= 10;
            if (dig != 0 && N % dig == 0) count++;
        }
        return count;
    }
}
