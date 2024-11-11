import java.util.Scanner;
public class Main {
    public static int func(int n){
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;

        return func(n-2) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        System.out.println(func(n));
    }
}