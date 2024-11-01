import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static final int MAX_N = 100;
    public static int n,k;
    public static String T;
    public static int cnt;

    public static String str[] = new String[MAX_N];
    public static String words[] = new String[MAX_N];

    public static boolean start(String a, String b){
        if(a.length() < b.length()){
            return false;
        }

        for(int i = 0 ; i < b.length() ; i++){
            if(a.charAt(i) != b.charAt(i)){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        T = sc.next();

        for(int i = 0 ; i < n ; i++){
            str[i] = sc.next();

            if(start(str[i], T)){
                words[cnt++] = str[i];
            }
        }
        Arrays.sort(words, 0, cnt);

        System.out.print(words[k - 1]);
    }
}