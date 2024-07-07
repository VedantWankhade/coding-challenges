package gfg.stringsarrays;

import java.io.StringReader;
import java.util.Arrays;

/**
 <p>Problem - https://www.geeksforgeeks.org/problems/binary-number-to-decimal-number3525/1</p>
 <div class="problems_problem_content__Xm_eO"><p>Given a Binary Number <strong>B</strong>, find&nbsp;its decimal equivalent.<br>
&nbsp;</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong>B = 10001000
<strong>Output: </strong>136
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input: </strong>B = 101100
<strong>Output: </strong>44
</pre>

<p>&nbsp;</p>

<p><strong>Your Task:</strong><br>
You don't need to read or print anything. Your task is to complete the function&nbsp;<strong>binary_to_decimal()</strong>&nbsp;which takes the binary number as string input parameter and returns its decimal equivalent.<br>
&nbsp;</p>

<p><strong>Expected Time Complexity:&nbsp;</strong>O(K * Log(K)) where K is number of bits&nbsp;in binary number.<br>
<strong>Expected Space Complexity:&nbsp;</strong>O(1)<br>
&nbsp;</p>

<p><strong>Constraints:</strong><br>
1 &lt;= number of bits in binary number&nbsp;&nbsp;&lt;= 16</p>
</div>
 */
public class BinaryToDecimal {
    
    public static void main(String[] args) {
        System.out.println(binaryToDecimal("10001000"));
        System.out.println(binaryToDecimal("101100"));
        System.out.println(binaryToDecimal("1101"));
    }
    
    public static int binaryToDecimal(String str) {
        int dec = 0;
        for (int i = 0; i < str.length(); i++) {
            char bit = str.charAt(str.length() - i - 1);
            int bitValue = bit == '1' ? 1 : 0;
            dec += bitValue * Math.pow(2, i);
        }
        return dec;
    }
}