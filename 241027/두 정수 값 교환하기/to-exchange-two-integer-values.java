import java.util.Scanner;
public class Main {
    public static void func(int n, int m){
        System.out.println(m+" "+n);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        func(n, m);
    }
}