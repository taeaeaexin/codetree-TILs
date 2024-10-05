import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;
        int x = n-1;
        int y = n-1;
        int arr[][] = new int[n][n];

        while(cnt <= Math.pow(n,2)){
            arr[x][y] = cnt;
            
            if(x == 0 && arr[x+1][y] != 0){
                y--;
            }else 
            if(x > 0 && arr[x-1][y] == 0){
                x--;
            }else if(x == n-1 && arr[x-1][y] != 0){
                y--;
            }else if(x < n-1 && arr[x+1][y] == 0){
                x++;
            }
            cnt++;
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}