package stringsarrays;

import java.util.Arrays;

/**
 <p>Problem - https://www.geeksforgeeks.org/problems/almost-equal-java/1
 </p>
 
 <div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given two strings <strong>S1</strong> and <strong>S2</strong> consisting of only lowercase characters whose <a href="http://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/">anagrams </a>are almost equal. The task is to count the number of characters which needs to be <strong>edited</strong>(<strong>delete</strong>) to make S1 equal to S2.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
madame
madam</span>

<span style="font-size:18px"><strong>Output:</strong>
1</span>

<span style="font-size:18px"><strong>Explanation:
</strong>String S1 = madame, string S2 = madam. character 'e' in </span>
<span style="font-size:18px">first string is need to be deleted to make S1 equal to S2.</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
suryansh
suryanshzzawesome</span>

<span style="font-size:18px"><strong>Output:</strong>
</span><span style="font-size:18px">9</span>

<span style="font-size:18px"><strong>Explanation:
</strong>String S1 = suryansh, string S2 = suryanshzzawesome. 
All character after "suryansh" in </span><span style="font-size:18px">second string are 
need to be deleted to make S1 equal to S2.</span></pre>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= S1, S2 &lt;= 10<sup>4</sup></span></p>
</div>
 */
public class AlmostEqualAnagrams {
    public static void main(String[] args) {
        System.out.println(countChars("madame", "madam"));
        System.out.println(countChars("suryansh", "suryanshzzawesome"));
        System.out.println(countChars("geeksforgeeks", "geeksforgeekscoursesgeeks"));
    }
    
    static int countChars(String s1, String s2) {
        System.out.println(s1 + " " + s2);
        int[] count = new int[26];
        int res = 0;
        for (char c: s1.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c: s2.toCharArray()) {
            count[c-'a']--;
        }
        Arrays.stream(count).forEach(i -> System.out.print(i + " "));
        for (int i: count) {
            if (i != 0) res += Math.abs(i);
        }
        return res;
    }
}