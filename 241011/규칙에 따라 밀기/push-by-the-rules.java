import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int len = A.length();

        for(int i = 0 ; i < B.length() ; i++){
            if(B.charAt(i) == 'L'){
                A = A.substring(1) + A.substring(0,1);
            }else{
                A = A.substring(len-1, len) + A.substring(0, len-1);
            }
        }

        System.out.println(A);

    }
}