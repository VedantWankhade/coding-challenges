package gfg.stringsarrays;

/**
 <p>Problem - https://www.geeksforgeeks.org/problems/decimal-to-binary-1587115620/1</p>
 <div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a decimal number N, compute its binary equivalent.</span></p>
<p><strong><span style="font-size: 18px;">Example 1:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> N = 7
<strong>Output:</strong> 111</span></pre>
<p>&nbsp;</p>
<p><strong><span style="font-size: 18px;">Example 2:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> N = 33
<strong>Output: </strong>100001</span>
</pre>
<p><strong><span style="font-size: 18px;">Your Task:</span></strong><br><span style="font-size: 18px;">You don't need to read input. Complete the function <strong>toBinary()</strong> which takes the decimal number N as the input parameter and <strong>prints&nbsp;its binary equivalent</strong>.<br><strong>Note: </strong>Print the output in a single line, the next line character is printed by the Driver Code.</span></p>
<p>&nbsp;</p></div>
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        toBinary(7);
        toBinary(33);
    }
    
    static void toBinary(int N) {
	   StringBuilder res = new StringBuilder();
       while (N >= 1) {
           int r = N % 2;
           N /= 2;
           res.append(r);
       }
        System.out.println(res.reverse());
	}
}