import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int n = 0;

        for(int i = 0 ; i < A.length()+1 ; i++){
            if(A.equals(B)){
                System.out.println(n);
                break;
            }else if(i == A.length()){
                System.out.println(-1);
            }else{
                A = A.charAt(A.length()-1)+A.substring(0,A.length()-1);
                n++;
            }
        }

    }
}