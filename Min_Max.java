import java.util.Scanner;
import java.util.Arrays;

class Result {
    public void miniMaxSum(int[] arr) {
        long min, max;
        min = max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min = min + arr[i];
        }
        for (int j = 1; j < arr.length; j++) {
            max = max + arr[j];
        }
        System.out.print(min + " " + max);
    }

}

public class Min_Max {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Result obj = new Result();
        obj.miniMaxSum(arr);
    }
}