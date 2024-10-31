import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        String a = sc.next();
        String b = sc.next();
        boolean flag = true;

        char c_a[] = a.toCharArray();
        char c_b[] = b.toCharArray();
        
        Arrays.sort(c_a);
        Arrays.sort(c_b);

        for(int i = 0 ; i < a.length() ; i++){
            if(c_a[i] != c_b[i]){
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