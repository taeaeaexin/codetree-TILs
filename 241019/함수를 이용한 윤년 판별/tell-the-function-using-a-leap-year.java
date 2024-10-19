import java.util.Scanner;
public class Main {
    public static boolean func2(int year){
        if(year % 100 == 0 && year % 400 != 0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean func(int year){
        if(year % 4 == 0){
            if(func2(year)){
                return false;   
            }else{
                return true;
            }
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.println(func(y));
    }
}