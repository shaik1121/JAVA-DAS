import java.util.Scanner;

public class numberofSteps {
    public static void numSteps(int a, int count) {
        if (a == 0) {
            System.out.println(count);
            return;
        }
        if (a % 2 == 0) {
            numSteps(a/2, count + 1);
        }else{
            numSteps(a-1, count + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int temp = 0;
        numSteps(num, count);
    }
}
