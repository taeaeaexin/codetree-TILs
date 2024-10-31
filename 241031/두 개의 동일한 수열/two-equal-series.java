import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        boolean flag = true;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0 ; i < n ; i++){
            if(A[i] != B[i]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}