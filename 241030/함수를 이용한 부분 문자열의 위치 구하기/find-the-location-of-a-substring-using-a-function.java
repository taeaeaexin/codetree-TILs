import java.util.Scanner;

public class Main {
    public static String A;
    public static String B;

    public static int func(){
        for(int i = 0 ; i <= A.length()-B.length()+1 ; i++){
            for(int j = 0 ; j <= B.length()-1 ; j++){
                if(A.charAt(i+j) != B.charAt(j)){
                    break;
                }else if(j == B.length()-1){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        A = sc.next();
        B = sc.next();
        System.out.println(func());
    }
}