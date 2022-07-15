import java.util.Scanner;

public class Recursion {
    public static void powerofN(int i, int base, int power, int sum) {
        if (i == power) {
            System.out.println(sum);
            return;
        }
        sum = sum * base;
        powerofN(i+1, base, power,sum);
    }
    public static void fibonacci(int n, int first, int last, int sum) {
        if (sum > n) {
            return;
        }
        sum = first + last;
        last = first;
        first = sum;
        System.out.print(sum+", ");
        fibonacci(n, first, last, sum);

    }
    public static void factorial(int i, int n, int multi) {
        if (i == n + 1) {
            System.out.println(multi);
            return;
        }
        multi = multi * i;
        factorial(i + 1, n, multi);
    }
    public static void sumofNNum(int i, int n, int total) {
        if (i == n+1) {
            System.out.println(total);
            return;
        }
        total+=i;
        sumofNNum(i+1,n,total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int total = 0;
        int power = sc.nextInt();
        sumofNNum(i,n,total);
        factorial(i, n, 1);
        fibonacci(n, 0, 1, 0);
        powerofN(i, n, power, 1 );

    }
}
