import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        String[] num = number.split(":");
        int a = Integer.parseInt(num[0]);
        System.out.println(a+1+":"+num[1]);

    }
}