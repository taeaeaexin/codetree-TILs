import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int answer = 0;
        if(a < 11){
            answer = -1;
        }else if(a == 11 && b < 11){
            answer = -1;
        }else if(a == 1 && b == 11 && c <= 11){
            answer = 1;
        }else{
            answer = (a*24*60+b*60+c)-(11*24*60+11*60+11);
        }
        System.out.println(answer);

    }
}