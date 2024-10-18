import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        int sum = 0;

        for(int i = a ; i <= b ; i++){
            if(i == 2){
                sum += 2;
            }
            for(int j = 2 ; j < i ; j++){
                if(i % j == 0){
                    break;
                }
                if(j == i-1){
                    sum += i;
                }                
            }
        }
        System.out.println(sum);
    }
}