import java.util.Scanner;
public class Main {
    public static boolean check(int num){
        while(num > 0){
            if(num % 10 == 3 || num % 10 == 6 || num % 1 == 9){
                return true;
            }
            num /= 10;

        }
        return false;
    }

    public static int count(int a, int b){
        int cnt = 0;
        for(int i = a ; i <= b ; i++){
            if(i % 3 == 0 && check(i)){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(count(a , b));
    }
}