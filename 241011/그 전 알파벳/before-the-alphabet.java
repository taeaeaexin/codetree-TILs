import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char alp = sc.next().charAt(0);
        int Nalp = (int)alp;

        if(Nalp == 97){
            Nalp = 112;
        }else{
            Nalp--;
        }
        alp = (char)Nalp;
        System.out.println(alp);
    }
}