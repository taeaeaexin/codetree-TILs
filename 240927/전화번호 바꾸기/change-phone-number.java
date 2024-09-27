import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String phon_number = sc.next();
        String[] pn = phon_number.split("-");
        System.out.println("010-"+pn[2]+"-"+pn[1]);
    }
}