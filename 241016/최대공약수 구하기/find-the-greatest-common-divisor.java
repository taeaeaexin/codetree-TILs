import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = n ; i > 0 ; i--){
            if(n%i == 0 && m%i == 0){
                System.out.println(i);
                break;
            }
        }
    }
}