import java.util.Scanner;
public class Main {
    public static boolean func2(int num){
        int x = 10;
        int sum = 0;

        while(num > 0){
            sum += num % x;
            num -= num % x;
            num /= 10;
        }

        if(sum % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean func(int num){
        if(1 <= num && num <= 3){
            return true;
        }

        for(int i = 2 ; i < num ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a,b,cnt;
        a = sc.nextInt();
        b = sc.nextInt();
        cnt = 0;

        for(int i = a ; i <= b ; i++){
            if(func(i) && func2(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}