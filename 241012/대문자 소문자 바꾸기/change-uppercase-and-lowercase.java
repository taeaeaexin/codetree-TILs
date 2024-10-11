import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char arr[] = str.toCharArray();

        for(int i = 0 ; i < str.length() ; i++){
            if('a' <= arr[i] && arr[i] <= 'z'){
                System.out.print((char)(arr[i]-'a'+'A'));
            }
            if('A' <= arr[i] && arr[i] <= 'Z'){
                System.out.print((char)(arr[i]-'A'+'a'));
            }
        }
    }
}