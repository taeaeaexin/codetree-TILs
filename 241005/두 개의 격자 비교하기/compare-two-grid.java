import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int arr[][] = new int[2*n][m];
        int arr_2[][] = new int[n][m];

        for(int i = 0 ; i < 2*n ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(arr[i][j] == arr[i+n][j]){
                    System.out.print(0+" ");
                }else{
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }

    }
}