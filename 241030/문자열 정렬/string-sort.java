import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        String str = sc.next();
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        str = new String(arr);
        System.out.print(str);
    }
}