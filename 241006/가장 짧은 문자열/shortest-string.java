import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a,b,c;
        a = sc.next();
        b = sc.next();
        c = sc.next();
        int max, min;
        max = 0;
        min = 999;
        
        if(a.length() > max){
            max = a.length();
        }
        if(b.length() > max){
            max = b.length();
        }
        if(c.length() > max){
            max = c.length();
        }

        if(a.length() < min){
            min = a.length();
        }
        if(c.length() < min){
            min = c.length();
        }
        if(b.length() < min){
            min = b.length();
        }

        System.out.println(max - min);
    }
}