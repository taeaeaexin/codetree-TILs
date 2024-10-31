import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int N = sc.nextInt();
        int arr[] = new int[2*N];
        int max = 0;

        for(int i = 0 ; i < 2 * N ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i = 0 ; i < N ; i++){
            int j = 2*N -i -1;
                if(arr[i] + arr[j] > max){
                    max = arr[i] + arr[j];
            }
        }
        System.out.println(max);
    }
}