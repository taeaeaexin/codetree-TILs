import java.util.Scanner;
public class Main {
    public static int func(int n, int cnt){
        if(n == 1)
            return cnt-1;

        if(n % 2 == 0)
            return func(n / 2, cnt + 1);
        else
            return func(n * 3 + 1, cnt + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int cnt = 1;

        System.out.println(func(n, cnt));
    }
}