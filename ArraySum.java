import java.util.Scanner;

class Result {

    public int SimpleArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;

    }

}

public class ArraySum {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans;
        Result obj = new Result();
        ans = obj.SimpleArraySum(arr);
        System.out.print(ans);
    }

}
