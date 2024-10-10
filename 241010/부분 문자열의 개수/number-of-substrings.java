import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int cnt = 0;

        for(int i = 0 ; i < A.length()-B.length()+1 ; i++){
            int cnt2 = 0;
            for(int j = 0 ; j < B.length() ; j++){
                if(A.charAt(i+j) == B.charAt(j)){
                cnt2++;
                }
            }

            if(cnt2 == B.length()){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}