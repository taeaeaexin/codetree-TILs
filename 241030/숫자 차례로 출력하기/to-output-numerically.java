import java.util.Scanner;
public class Main {
    public static void func(int N){
        if(N == 0)
            return;

        func(N-1);
        System.out.print(N+" ");
    }

    public static void func2(int N){
        if(N == 0)
         return;

        System.out.print(N+" ");
        func2(N-1);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        func(N);
        System.out.println();
        func2(N);
    }
}