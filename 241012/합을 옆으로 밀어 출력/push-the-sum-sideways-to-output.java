import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            int a = sc.nextInt();
            sum += a;
        }
        String str = Integer.toString(sum);
        System.out.println(str.substring(1) + str.substring(0,1));
    }
}