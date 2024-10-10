import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char a = str.charAt(0);
        char b = str.charAt(1);
        char s[] = str.toCharArray();

        for(int i = 1 ; i < str.length() ; i++){
            if(b == str.charAt(i)){
                s[i] = a;
            }
        }
        
        for(int i = 0 ; i < str.length() ; i++){
            System.out.print(s[i]);
        }
    }
}