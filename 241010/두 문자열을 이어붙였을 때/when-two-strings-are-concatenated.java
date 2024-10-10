import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();
        String AB = A+B;
        String BA = B+A;
        int flag = 0;

        for(int i = 0 ; i < A.length() + B.length() ; i++){
            if(AB.charAt(i) != BA.charAt(i)){
                flag = 1;
                break;
            }
        }

        if(flag == 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}