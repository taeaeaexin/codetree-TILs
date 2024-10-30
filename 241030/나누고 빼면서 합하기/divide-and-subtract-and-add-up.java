import java.util.Scanner;
public class Main {
    public static int m;

    public static int func() {
        if(m % 2 == 1){
            m--;
        }else{
            m /= 2;
        }
        return m;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int A[] = new int[n];
        m = sc.nextInt();
        int sum = 0;

        for(int i = 0 ; i < n ; i++){
            A[i] = sc.nextInt();
        }

        sum += A[m-1];
        while(m > 1){
            sum += A[func()-1];
        }
        System.out.println(sum);
    }
}