import java.util.Scanner;
public class Main {
    public static int func(int a, int b){
        int answer = a;
        for(int i = 0 ; i < b-1 ; i++){
            answer = answer * a;
        }
        return answer;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(func(a,b));
    }
}