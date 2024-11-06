import java.util.Scanner;

public class Main {
    public static int func(int n){
        if(n == 0)
            return n;

        return func(n / 10) + (n % 10)*(n % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int N = sc.nextInt();
        System.out.println(func(N));
        
    }
}