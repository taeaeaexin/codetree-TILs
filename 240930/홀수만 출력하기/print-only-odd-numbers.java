import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i = 1 ; i <= N ; i++){
            if(i % 2 == 1 && i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}