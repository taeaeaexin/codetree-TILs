import java.util.Scanner;
public class Main {
    public static int cal(int N){
        int sum = 0;
        for(int i = 1 ; i <= N ; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        System.out.println(cal(N)/10);
    }
}