import java.util.Scanner;

class Wrapper {
    int value;

    public Wrapper(int value){
        this.value = value;
    }

}

public class Main {
    // public static void func(Wrapper arr, int N) {
    //     for(int i = 0 ; i < N ; i++){
    //         if(arr[i] < 0){
    //             arr[i] = Math.abs(arr[i]);
    //         }
    //     }
    //     return;
    // }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0 ; i < N ; i++){
            arr[i] = sc.nextInt();
        }

        // Wrapper w_arr = new Wrapper(arr);
        // func(w_arr, N);

        for(int i = 0 ; i < N ; i++){
            if(arr[i] < 0){
                arr[i] = Math.abs(arr[i]);
            }
        }

        for(int i = 0 ; i < N ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}