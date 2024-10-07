import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str_2 = sc.nextLine();

        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) != ' '){
                System.out.print(str.charAt(i));
            }
        }

        for(int i = 0 ; i < str_2.length() ; i++){
            if(str_2.charAt(i) != ' '){
                System.out.print(str_2.charAt(i));
            }
        }
        
    }
}