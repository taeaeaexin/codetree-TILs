import java.util.Scanner;
public class Main {
    public static boolean func(int num){
        if(num % 2 == 0 || num % 10 == 5 || (num % 3 == 0 && num % 9 != 0)){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a,b,cnt;
        a = sc.nextInt();
        b = sc.nextInt();
        cnt = 0;

        for(int i = a ; i <= b ; i++){
            if(func(i)){
            cnt++;
            }
        }
        System.out.println(cnt);
    }
}