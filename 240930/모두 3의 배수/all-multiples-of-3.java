import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int flag = 0;
        
        for(int i = 0 ; i < 5 ; i++){
            int num = sc.nextInt()l
            if(num % 3 != 0){
                break;
            }
            if(i == 4){
                flag = 1;
            }
        }

        System.out.println(flag)
    }
}