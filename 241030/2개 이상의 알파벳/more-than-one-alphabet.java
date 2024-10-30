import java.util.Scanner;
public class Main {
    public static boolean func(String A) {
        int cnt = 0;
        for(int i = 0 ; i < A.length()-2 ; i++){
            boolean flg = true;
            for(int j = i+1 ; j < A.length()-1 ; j++){
                if(A.charAt(i) == A.charAt(j)){
                    flg = false;
                    break;
                }
            }
            if(flg){
                cnt++;
            }
        }
        if(cnt >= 2){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        if(func(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}