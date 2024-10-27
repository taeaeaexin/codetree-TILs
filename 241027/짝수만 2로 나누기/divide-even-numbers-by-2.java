import java.util.Scanner;
public class Main {
    public static void func(int arr2[], int N){
        for(int i = 0 ; i < N ; i++){
            if(arr2[i] % 2 == 0){
                arr2[i] = arr2[i] / 2;
            }
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0 ; i < N ; i++){
            arr[i] = sc.nextInt();
        }

        func(arr, N);
        for(int i = 0 ; i < N ; i++){
             System.out.print(arr[i]+" ");
        }
    }
}