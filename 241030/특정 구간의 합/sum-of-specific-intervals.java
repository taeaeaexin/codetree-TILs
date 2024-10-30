import java.util.Scanner;
public class Main {
    public static final int N = 100;
    public static int A[] = new int[N];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0 ; i < m ; i++){
            int sum = 0;
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            for(int j = a1-1 ; j <= a2-1 ; j++){
                sum += A[j];
            }
            System.out.println(sum);
        }

    }
}