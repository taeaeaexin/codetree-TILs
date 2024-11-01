import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        char c_a[] = a.toCharArray();
        char c_b[] = b.toCharArray();
        Arrays.sort(c_a);
        Arrays.sort(c_b);
        a = new String(c_a);
        b = new String(c_b);

        if(a.length() == b.length() && Arrays.equals(c_a,c_b)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}