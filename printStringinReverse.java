import java.lang.module.FindException;
import java.util.Scanner;

public class printStringinReverse {
    public static void stringReverse(String str, int index) {
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        stringReverse(str, index-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a word:");
        String src = sc.next();
        int index = src.length()-1;
        stringReverse(src, index);
    }
}
