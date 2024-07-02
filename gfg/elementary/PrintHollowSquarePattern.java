package elementary;

/**
 <div class="problem-statement">
 <p></p><p><span style="font-size:18px">Given an integer <strong>S</strong>, write a program to print the square of size <strong>S&nbsp;</strong>using <strong>*</strong><strong> </strong>character<strong>.&nbsp;</strong></span></p>
 <p><em><span style="font-size:18px">Before submitting code, verify it by running offline. Does your square visually looks like a square? </span></em></p>
 <p><span style="font-size:18px"><strong>Example 1:</strong></span><span style="font-size:18px"><strong> </strong></span></p>
 <pre><span style="font-size:18px"><strong>Input:</strong>
 S = 4
 <strong>Output:</strong>
 <img alt="" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAKgAAADcCAYAAADk+OpjAAAFYklEQVR42u3dX2iVdRzH8d/ZjmdNlBQyFlRioVEmg6hIiiSIyIvKLgKDulArCgqpC60uIuoigi5CaBcFBdpVgpSF3pWRoWEhheSFrnRFLYUI3eZx7jzfLjYxzVIvtud39rxe8ECo4Lf53jn+w08tpRQJMtXhQ4BAQaAIFAQKAkWgIFAECgIFgSJQECgCBYGCQBEoCBSBgkBBoAgUBIpAQaAgUAQKAoUSA+1cnF7+Zig1myfSb+8tT42y/s/dkecd56iX8TlRbzRSV1c9ddU7Uq3Ez0135HhH6W/xMfHvPcY//rsM7sjzjrIDjRNpeGT8gzA8NFLeB8Ided4xdYHW0rxHP0i7PutL61cuTVd3T7xpFIPp8EAzRWqlw/2HUmviWzfm9aYHn3srbf56a3rhxk53TPs7LuW1fTKeWk+s2TYURUREFDH6x57YtO7+WNDdGYvW7Y7RscOxYVkjZvTcGU/37YiBkfFvGTEae19ZEp3umN53XOQzea+gnXPSqV/2pJ+Pt1KkWppx5a3psTe3pe+/3ZQeiINpcHh/+mvx22nnvi9T3zPL0jXdtZSiSCMDe9K+P7tTtzum9x0X/Xo/yf9GfW3WgnTXQ4+kh5ffk5besjgtvLYnzZ1ZTx21WopiLDWPHUm/9u9Pe3d/kbZv+Sht2XEgHSvcUZU7ynuL/4+ncd3K+LD/ZDSbzRjcvjZ6Z03t9++OvO84zzN131nXolWx+dBoFMe3xdqnNsZgqxVHP18ft82uhTvcUWqgtZ4V8f7Bk1FEKwY3rog53ctiw09jEcVY/P7x6ri+7o4q31FuoB3zY9XWI9GKiGJkd7x4Uz1S6oyFz38Vw0VEFMdj57qbo+GOat5RbqAdMX/Np3G0FRHFqeh/596YffrrZt4Rb/zQjCIiiqFd8VJvlzsqd0fZgXZcFSve/TGGiiJOHeiL++ae/fOambe/Ht+NFFGcHIhPnrwh6u6o1h1ZvMXXZseSx1+NtXdfHrV/ff1l0fvEa/Hs0iuiwx3VvOP/fo482b8PCu31l0VAoAgUBIpAQaAgUAQKAgWBIlAQKAIFgYJAESgIFIGCQEGgCBQEikBBoCBQBAoCRaAg0DMy3YSsPFudZz4nctyExFbnhDw3IbHVOfFxyHMTUp+2Ose/OONNyGqw1dmWm5CVeWx1nv5VYXttQlbnV+u2Os/+DtpoE7JSb/S2OttuE7LSj63O/DchK/vY6myPTchKPrY622cTsnqPrc622oSs2GOrs902ISv26mmrs602Iav5m/a2OiHXP4sHgSJQECgIFIGCQBEoCBQEikBBoAgUBAoCRaAgUAQKAgWBIlAQKAgUgYJAESgIFASKQC/IVmeebHWe+Zyw1Znna5WtzpSSrc5c2eqc+DjY6syzT1ud419sq7NktjptddrqtNVJNX5cbHVW9Y3eVqetznZ6bHXa6rTVaavTMw1/XGxCVvax1WmrM9/HVqetTludtjo9tjphOv5ZPAgUgYJAQaAIFASKQEGgIFAECgJFoCBQECgCBYEiUBAoCBSBgkBBoAgUBIpAQaAgUAR6QblsQrojzzvOUeGtTnfkeUfpb/G5bEK6I887yg40l01Id+R5x9QFmssmpDvyvONSXtun8yakO2x1nv9XhZlsQrojzzsu+vW+Ilud7sjzjvLe4jPfhHSHrc5sNyHdYasz201Id9jqzHcT0h22OlO2m5DuyPMOW53usNXZJpuQ7rDVCe39l0VAoAgUBIpAQaAgUAQKAgWBIlAQKAIFgYJAESgIFIGCQEGgCBQEikBBoCBQBAoCRaAgUBAoAgWBgkARKAgUgYJAQaAIFASKQEGgIFDa2N/9rrf9sDQOPQAAAABJRU5ErkJggg==" style="height:220px;width:168px" class="img-responsive">

 <strong>Explanation:</strong>
 It's a square! Each side contains S = 4 *.</span></pre>
 <p><span style="font-size:18px"><strong>Your Task:</strong><br>
 The function <strong>square </strong>takes <strong>S</strong> as a <strong>parameter</strong>. Use this s to make your square with S&nbsp;*. <strong>Print </strong>your answer within the function <strong>itself</strong>. You <strong>do need</strong> to provide a new line at the end.</span></p>
 <p></p>
 </div>
 */
public class PrintHollowSquarePattern {
    public static void main(String[] args) {
        print(4);
    }

    static void print(int s) {
        for (int i = 0; i < s; i++) {
            System.out.print("* ");
            char c;
            if (i == 0 || i == (s - 1)) {
                c = '*';
            } else {
                c = ' ';
            }
                for (int j = 0; j < s - 2; j++) System.out.print(c + " ");
            System.out.println("*");
        }
    }
}
