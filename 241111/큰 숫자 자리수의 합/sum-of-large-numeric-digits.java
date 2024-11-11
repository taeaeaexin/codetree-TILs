import java.util.Scanner;
public class Main {
    public static int func(int n){
        if(n == 0)
            return 0;
        return func(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a*b*c;
        System.out.println(func(d));
    }
}