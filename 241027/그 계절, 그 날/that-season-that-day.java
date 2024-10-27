import java.util.Scanner;
public class Main {
    public static boolean func2 (int Y, int M, int D){
        if(M == 2){
            if(Y % 4 == 0 && !(Y % 100 == 0)){
                if(1 <= D && D <= 29){
                    return true;
                }else{
                    return false;
                }
            }else if(Y % 4 == 0 && Y % 400 == 0){
                if(1 <= D && D <= 29){
                    return true;
                }else{
                    return false;
                }
            }
        }

        if(M == 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10 || M == 12){
            if(1 <= D && D <= 31){
                return true;
            }else{
                return false;
            }
        }else{
            if(1 <= D && D <= 30){
                return true;
            }else{
                return false;
            }
        }
    }

    public static String func (int Y, int M, int D){
        if(func2(Y, M, D)){
            if(3 <= M && M <= 5){
                return "Spring";
            }else if(6 <= M && M <= 8){
                return "Summer";
            }else if(9 <= M && M <= 11){
                return "Fall";
            }else if(M == 12 || (1 <= M && M <= 2)){
                return "Winter";
            }else{
                return "-1";
            }}
            else{
            return "-1";
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int Y, M, D;
        Y = sc.nextInt();
        M = sc.nextInt();
        D = sc.nextInt();

        System.out.println(func(Y,M,D));
    }
}