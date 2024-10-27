import java.util.Scanner;

class Secret {
    String code;
    char point;
    int time;

    public Secret(String code, char point, int time){
        this.code = code;
        this.point = point;
        this.time = time;
    }

}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String sCode;
        char mPoint;
        int time;

        sCode = sc.next();
        mPoint = sc.next().charAt(0);
        time = sc.nextInt();

        Secret sp = new Secret(sCode, mPoint, time);

        System.out.println("secret code : " + sp.code);
        System.out.println("meeting point : " + sp.point);
        System.out.println("time : " + sp.time);
        
    }
}