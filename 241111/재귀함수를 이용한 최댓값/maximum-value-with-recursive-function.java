import java.util.Scanner;
public class Main {
    public static final int MAX_N = 100;
    public static int arr[] = new int[MAX_N];

    public static int func(int n){
        if(n == 0)
            return 0;

        return Math.max(func(n-1), arr[n]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(func(n-1));
    }
}