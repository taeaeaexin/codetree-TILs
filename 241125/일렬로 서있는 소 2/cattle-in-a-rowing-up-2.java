import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int N = sc.nextInt();
        int[] arr = new int[N+1];
        int count =0;
        for(int i = 1 ; i <= N ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 1 ; i <= N ; i++){
            for(int j = i+1 ; j <= N ; j++){
                for(int k = j+1 ; k <= N ; k++){
                    if(arr[i] <= arr[j] && arr[j] <= arr[k]){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}