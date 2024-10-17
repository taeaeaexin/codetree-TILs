import java.util.Scanner;
public class Main {
    public static int func(int a, int b, int c){
        int min = a;
        if(min > b){
            min = b;
        }else if(min > c){
            min = c;
        }
        return min;

    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println(func(a,b,c));
    }
}