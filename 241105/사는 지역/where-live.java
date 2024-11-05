import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class People{
    String name;
    String address;
    String city;

    public People(String name, String address, String city){
        this.name = name;
        this.address = address;
        this.city = city;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int num = sc.nextInt();
        People peo[] = new People[num];

        for(int i = 0 ; i < num ; i++){
            String name = sc.next();
            String address = sc.next();
            String city = sc.next();
            peo[i] = new People(name, address, city);
        }
        Arrays.sort(peo, Comparator.comparing(p -> p.name));
        System.out.println("name "+peo[num-1].name);
        System.out.println("addr "+peo[num-1].address);
        System.out.println("city "+peo[num-1].city);
    }
}