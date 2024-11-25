import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int[] house = new int[n+1];
        for(int i = 1 ; i <= n ; i++){
            house[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for(int i = 1 ; i <= n ; i++){
            int result = 0;
            for(int j = 1 ; j <= n ; j++){
                if(i != j){
                    result += Math.abs(i-j) * house[j];
                }else{
                    continue;
                }
            }
            min = Math.min(result, min);
        }
        System.out.println(min);
    }
}