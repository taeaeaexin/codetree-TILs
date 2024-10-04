import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a,b,sum;
        sum = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        int arr[] = new int[b];

        while(a > 1){
            a /= b;
            for(int i = 0 ; i <= b ; i++){
                if(i == a % b){
                    arr[i]++;
                }
            }
        }

        for(int i = 0 ; i <= b ; i++){
            sum += Math.pow(arr[i],2);
        }
        System.out.println(sum);
    }
}