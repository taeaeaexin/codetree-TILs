import java.util.Scanner;
public class Main {
    public static boolean func(int M, int D){
        if((M == 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10 || M == 12) && 1 <= D && D <= 31){
            return true;
        }else if(M == 2 && 1 <= D && D <= 28){
            return true;
        }else if(((M == 4 || M == 6 || M == 9 || M == 11) && 1 <= D && D <= 30)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int M, D;
        M = sc.nextInt();
        D = sc.nextInt();

        if(func(M ,D)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}