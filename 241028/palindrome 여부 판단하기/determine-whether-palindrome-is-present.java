import java.util.Scanner;
public class Main {
    public static String str;

    public static boolean palindrome(String s) {
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        if(palindrome(str)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}