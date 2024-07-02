package elementary;

/**
 <div class="problem-statement">
 <p></p><p><span style="font-size:18px">Given two number <strong>n1</strong> and <strong>n2</strong>, <strong>n1 &gt; n2</strong>. Find&nbsp;the differences between mathematical tables of <strong>n1 </strong>and <strong>n2</strong>. </span></p>
 <p><span style="font-size:18px"><strong>Example 1:</strong></span></p>
 <pre><span style="font-size:18px"><strong>Input:</strong>
 n1 = 9, n2 =<strong> </strong>4
 <strong>Output:</strong>
 5 10 15 20 25 30 35 40 45 50&nbsp;
 <strong>Explanation:</strong>
 9 - 4 = 5, 18 - 8 = 10 , 27 - 12 = 15,
 36 - 16 = 20, 45 - 20 = 25, 54 - 24 = 30,
 63 - 28 = 35, 72 - 32 = 40, 81 - 36 = 45,
 90 - 40 = 50.</span></pre>
 <p><span style="font-size:18px"><strong>Your Task:</strong><br>
 The n1 and n2 are provided as <strong>parameters </strong>to the function <strong>difference</strong>. Your task is write the code at the mentioned place so that your code <strong>prints </strong>the difference of mathematical tables of n1 and n2 in a single line. <strong>Please don't</strong> provide a <strong>new line </strong>as it is provided by the <strong>driver </strong>code.</span></p>
 <p></p>
 </div>
 */
public class MulTableDifference {
    public static void main(String[] args) {
        mulTableDiff(9, 4);
    }

    static void mulTableDiff(int n1, int n2) {
        for (int mul = 1; mul < 11; mul++) {
            System.out.print(n1*mul - n2*mul + " ");
        }
        System.out.println();
    }
}
