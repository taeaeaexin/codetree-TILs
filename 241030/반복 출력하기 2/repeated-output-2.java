import java.util.Scanner;
public class Main {
    public static void printer(int n){
        if(n == 0)
            return;

        printer(n-1);
        System.out.println("HelloWorld");
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printer(N);
    }
}