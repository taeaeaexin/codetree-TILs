import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n, m, min;
        n = sc.nextInt();
        m = sc.nextInt();
        min = 0;
        if(n > m){
            int a = n;
            n = m;
            m = a;
        }

        for(int i = 3 ; i < m ; i--){
            if(n%i == 0 && m%i == 0){
                min = i;
                break;
            }
        }
        System.out.println(n*min);
    }
}