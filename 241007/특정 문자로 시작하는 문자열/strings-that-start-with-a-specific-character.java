import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.next();
        }

        char c = sc.next().charAt(0);
        int cnt = 0;
        int len = 0;

        for(int i = 0 ; i < n ; i++){
            if(arr[i].charAt(0) == c){
                cnt++;
                len += arr[i].length();
            }
        }

        System.out.printf(cnt+" %.2f",(float)len/cnt);
    }
}