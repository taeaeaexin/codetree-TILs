import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int min = 0;
        int ans = 1;
        int flag = 0;

        if(n > m){
            int a = n;
            n = m;
            m = a;
        }

        while(flag == 0){
            for(int i = 2 ; i <= m ; i++){
                if(n%i == 0 && m%i == 0){
                    ans *= i;
                    n /= i;
                    m /= i;
                    break;
                }else if(i == m){
                    ans = ans * n * m;
                    flag = 1;
                    break;
                }
            }

        }

        System.out.println(ans);
    }
}