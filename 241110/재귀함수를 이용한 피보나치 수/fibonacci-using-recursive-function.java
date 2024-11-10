import java.util.Scanner;
public class Main {
    // public static int func(int arr[], n){
    //     if(n == 0)
    //         return;
        
    //     return func(n)
    // }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2 ; i <= n-1 ; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(arr[n-1]);
    }
}