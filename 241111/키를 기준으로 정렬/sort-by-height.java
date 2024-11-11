import java.util.Scanner;
import java.util.Arrays;

class People{
    String name;
    int cm;
    int kg;

    public People(String name, int cm, int kg){
        this.name = name;
        this.cm = cm;
        this.kg = kg;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        People people[] = new People[n];

        for(int i = 0 ; i < n ; i++){
            String name = sc.next();
            int cm = sc.nextInt();
            int kg = sc.nextInt();
            people[i] = new People(name, cm, kg);
        }

        Arrays.sort(people, (a,b) -> a.cm - b.cm);
        for(int i = 0 ; i < n ; i++)
            System.out.println(people[i].name+" "+people[i].cm+" "+people[i].kg);
    }
}