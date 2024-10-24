import java.util.Scanner;
public class Main {
    public static boolean func(int A[], int B[], int n1, int n2){
        for(int i = 0 ; i <= n1-n2 ; i++){
            int flag = 0;
            for(int j = 0 ; j < n2 ; j++){
                if(A[i+j] != B[j]){
                    break;
                }else{
                    flag++;
                    if(flag == n2){
                        return true;
                    }
                }
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        int A[] = new int[n1];
        int B[] = new int[n2];

        for(int i = 0 ; i < n1 ; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n2 ; i++){
            B[i] = sc.nextInt();
        }

        if(func(A, B, n1, n2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}