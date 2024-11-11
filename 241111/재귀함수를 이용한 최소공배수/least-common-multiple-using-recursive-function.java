import java.util.Scanner;
public class Main {
    public static int max(int a, int b){
        if(b == 0)
            return a;

        return max(b, a % b);
    }

    public static int min(int a, int b){
        return (a * b) / max(a, b);
    }

    public static int answer(int arr[], int n){
        if(n == 0)
            return arr[0];

        return min(arr[n-1], answer(arr, n-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(answer(arr, n));
    }
}