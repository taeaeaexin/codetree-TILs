import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        int flag = 0;

        for(int i = a ; i <= b ; i++){
            if((1920 % i == 0) && (2880 % i == 0)){
                flag = 1;
                break;
            }
        }

        System.out.println(flag);
    }
}