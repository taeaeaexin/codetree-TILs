import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        Arrays.sort(nums);

        for(int i = 0; i < n; i++)
            System.out.print(nums[i] + " ");
        System.out.println();

        for(int i = n-1; i >= 0; i--)
            System.out.print(nums[i] + " ");
        System.out.println();


    }
}