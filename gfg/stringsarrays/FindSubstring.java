package gfg.stringsarrays;

/**
 <div class="problem-statement">
 <p></p><p><span style="font-size:18px">Given a string s,</span> <span style="font-size:18px">and a pattern p. You need to find if p exists in s or not and return the starting index of p in s. If p does not exist in s then -1 will be returned.<br>
Here p and s both are case-sensitive.</span><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>
<pre><span style="font-size:18px"><strong>Input</strong></span>:
<span style="font-size:18px">s = "Hello"
p = "llo"
<strong>Output:</strong> 
2
<strong>Explanation</strong>: llo starts from the second index in Hello.
</span></pre>
<p><strong><span style="font-size:18px">Example 2:</span></strong></p>
<pre><span style="font-size:18px"><strong>Input:</strong>
s = "World"
p = "Doodle"
<strong>Output:
</strong>-1
<strong>Explanation</strong>: Both are different.</span>
</pre>
<p><span style="font-size:18px"><strong>Your Task:&nbsp; </strong></span><br>
<span style="font-size:18px">The input s and p are provided as a <strong>parameter </strong>to the function <strong>findPattern</strong>. You need to return the starting index of p in s if it exists, else return -1.</span></p>
 <p></p>
 </div>
 */
public class FindSubstring {
    public static void main(String[] args){
        System.out.println(findSubstring("Hello", "llo"));
        System.out.println(findSubstring("Hello", "No Thanks"));
        System.out.println(findSubstring("Hello", "ello"));
    }

    private static int findSubstring(String s, String p) {
        if (s.length() < p.length()) return -1;
        
        for (int i = 0; i <= s.length() - p.length(); i++) {
            boolean flag = false;
            for (int k = 0; k < p.length(); k++) {
                if (p.charAt(k) != s.charAt(k + i)) break;
                flag = true;
            }
            if (flag) return i;
        }
        return -1;
    }
}