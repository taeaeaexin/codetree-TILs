import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        
        if(A+B == B+A){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}