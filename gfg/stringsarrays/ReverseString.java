package gfg.stringsarrays;

/**
 <div class="problem-statement">
 <p></p><p><span style="font-size:18px">Given a string <strong>s</strong>, you need to reverse it.</span><br>
<br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>
<pre><span style="font-size:18px"><strong>Input</strong></span>:
<span style="font-size:18px">s = "Hello"
<strong>Output:</strong> 
olleH
<strong>Explanation</strong>: Reverse of Hello is olleH
</span></pre>
<p><strong><span style="font-size:18px">Example 2:</span></strong></p>
<pre><span style="font-size:18px"><strong>Input:</strong>
s = "World"
<strong>Output:
</strong>dlroW
<strong>Explanation</strong>: Reverse of World is dlroW</span>
</pre>
<p><span style="font-size:18px"><strong>Your Task:&nbsp; </strong></span><br>
<span style="font-size:18px">The task is to complete the&nbsp;<strong>reverseString() </strong>which takes a string&nbsp;<strong>s&nbsp;</strong>as parameter and <strong>returns</strong> the reversed string.</span></p>
 <p></p>
 </div>
 */
public class ReverseString {
    public static void main(String[] args){
        System.out.println(reverse("Hello"));
        System.out.println(reverse("xyz"));
        System.out.println(reverse("xy"));
    }
    
    private static String reverse(String s) {
        StringBuilder aux = new StringBuilder(s);
        for (int i = 0; i < aux.length() / 2; i++) {
            // System.out.println(aux.charAt(i) + " -> " + aux.charAt(aux.length() - i - 1));
            char temp = aux.charAt(i);
            aux.setCharAt(i, aux.charAt(aux.length() - 1 - i));
            aux.setCharAt(aux.length() - 1 - i, temp);
        }
        return aux.toString();
    }
}