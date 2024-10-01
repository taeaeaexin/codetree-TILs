import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i = 0 ; i < n * 2 ; i++){
            for(int a = 0 ; a < n-i ; a++){
                System.out.print("*");
            }
            for(int b = 0 ; b < i*2 ; b++){
                System.out.print(" ");
            }
            for(int c = 0 ; c < n-i ; c++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}