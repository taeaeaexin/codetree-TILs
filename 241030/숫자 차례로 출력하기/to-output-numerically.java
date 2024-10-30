import java.util.Scanner;
public class Main {
    public static void func(int N, int n){
        if(n == N+1){
            System.out.println();
            return;
        }

        System.out.print(n+" ");
        func(N, n+1);
    }

    public static void func2(int N){
        if(N == 0)
         return;

        System.out.print(N+" ");
        func2(N-1);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = 1;
        func(N, n);
        func2(N);
    }
}