import java.util.Scanner;

public class MoveAllX {
    public static void moveChar(String str, int count, int idx, String newString) {
        if (idx > str.length() - 1) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            return;
        }
        if (str.charAt(idx) == 'x') {
            count++;
            moveChar(str,count,idx + 1, newString);
        } else {
            char element = str.charAt(idx);
            newString += element;
            moveChar(str,count,idx + 1, newString);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "axbcxxxdbmsxxyxyxzpx";
        String newStr = "";
        moveChar(str,0,0,newStr);
    }
}
