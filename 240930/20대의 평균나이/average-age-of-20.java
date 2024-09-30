import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        float cnt = 0;
        float sum = 0;

        while(true){
            int age = sc.nextInt();
            
            if(age >= 30 || age < 20){
                break;
            }

            cnt++;
            sum += age;
        }

        System.out.printf("%.2f",sum/cnt);
    }
}