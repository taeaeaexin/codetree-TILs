import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int a,b;
        
        a = sc.nextInt();
        b = sc.nextInt();

        if(1 <= a){
            for(int i = 0 ; i < b ; i++){
                System.out.print(a);
            }
        }
        else {
            System.out.print(0);
        }
    }
}