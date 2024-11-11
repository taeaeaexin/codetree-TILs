import java.util.Scanner;
public class Main {
    public static int func(int arr[], int n){
        if(n == 1)
            return arr[0];
        
        return func2(arr[n-1], func(arr, n-1));
    }

    public static int func2(int a, int b){
        return (a * b) / func3(a, b);
    }

    public static int func3(int a, int b){
        if(b == 0){
            return a;
        }
        return func3(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(func(arr, n));
    }
}