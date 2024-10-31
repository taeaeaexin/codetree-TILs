import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n ; i++){
            B[i] = sc.nextInt();            
        }
        Arrays.sort(A);
        Arrays.sort(B);

        boolean flag = true;
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