import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void func(int arr[], int a){
        Arrays.sort(arr,0,a);
        System.out.print(arr[a/2]+" ");
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr_main[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr_main[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n ; i++){
            if((i+1) % 2 == 1){
                func(arr_main,i);
            }
        }
    }
}