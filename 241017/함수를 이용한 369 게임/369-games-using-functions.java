import java.util.Scanner;
public class Main {
    public static boolean check(int num){
        while(num > 0){
            if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9){
                return true;
            }
            num /= 10;
        }
        return false;
    }

    public static boolean count(int n){
        return (n % 3 == 0) || check(n);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a,b,cnt;
        cnt = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        for(int i = a ; i <= b ; i++){
            if(count(i)){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}