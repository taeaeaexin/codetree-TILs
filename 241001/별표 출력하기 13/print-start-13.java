import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int top = n;
        int bot = 1;

        while(top >= bot){
            for(int i = 0 ; i < top ; i++){
                System.out.print("* ");
            }
            System.out.println();
            for(int i = 0 ; i < bot ; i++){
                System.out.print("* ");
            }
            System.out.println();
            top--;
            bot++;
        }

        top = n;
        bot = 1;

        while(top > bot){
            for(int i = 0 ; i < bot ; i++){
                System.out.print("* ");
            }
            System.out.println();
            for(int i = 0 ; i < top ; i++){
                System.out.print("* ");
            }
            System.out.println();
            top--;
            bot++;
        }
    }
}