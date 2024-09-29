import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a_age = sc.nextInt();
        char a_sex = sc.nextChar();
        int b_age = sc.nextInt();
        char b_sex = sc.nextChar();

        if((a_age >= 19 && a_sex = 'M')||(b_age >= 19 && b_sex = 'M')){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}