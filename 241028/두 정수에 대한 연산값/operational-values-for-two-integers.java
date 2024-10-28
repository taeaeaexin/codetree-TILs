import java.util.Scanner;
public class Main {
    public static int a;
    public static int b;

    public static void func(int a, int b) {
        if(a > b){
            a += 25;
            b *= 2;
        }else{
            a *= 2;
            b += 25;
        }
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        func(a, b);

    }
}