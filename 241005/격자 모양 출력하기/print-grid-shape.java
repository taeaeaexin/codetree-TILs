import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int arr[][] = new int[n][n];

        
        for(int i = 0 ; i < m ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a-1][b-1] = a*b;
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}