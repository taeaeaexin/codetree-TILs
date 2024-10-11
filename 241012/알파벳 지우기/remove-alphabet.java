import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        String a = "";
        String b = "";

        for(int i = 0 ; i < str.length() ; i++){
            if('0' <= str.charAt(i) && str.charAt(i) <= '9'){
                a += str.charAt(i);
            }
        }

        for(int i = 0 ; i < str.length() ; i++){
            if('0' <= str2.charAt(i) && str2.charAt(i) <= '9'){
                b += str2.charAt(i);
            }
        }
        int na = Integer.parseInt(a);
        int nb = Integer.parseInt(b);
        System.out.println(na+nb);

    }
}