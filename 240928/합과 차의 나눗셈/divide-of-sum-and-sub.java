import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = (float)a;
        float d = (float)b;

        System.out.printf("%.2f", (c+d)/(c-d));
    }
}