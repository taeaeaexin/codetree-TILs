import java.util.Scanner;
public class Main {
    public static boolean func(int n){
        boolean test;
        if(n % 2 == 0)
            test = true;
        else
            test = false;

        return test;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(func(n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}