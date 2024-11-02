import java.util.Scanner;

class Character{
    String ID;
    int LV;

    public Character(String ID, int LV){
        this.ID = ID;
        this.LV = LV;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        String str = sc.next();
        int num = sc.nextInt();

        Character user = new Character("codetree", 10);
        Character user2 = new Character(str, num);

        System.out.println("user "+user.ID+" lv "+user.LV);
        System.out.println("user "+user2.ID+" lv "+user2.LV);
    }
}