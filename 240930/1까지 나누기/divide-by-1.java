import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 1;
        int cnt = 0;

        while(true){
            if(n <= 1){
                break;
            }
        n /= num;
        num++;

        }
        System.out.println(num-1);
    }
}