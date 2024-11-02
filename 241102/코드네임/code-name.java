import java.util.Scanner;
class Code{
    String name;
    int grade;

    public Code(String name , int grade){
        this.name = name;
        this.grade = grade;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Code cd[] = new Code[5];
        // 여기에 코드를 작성해주세요.
        int min = 100;
        int min_flag = 0;

        for(int i = 0 ; i < 5 ; i++){
            String name = sc.next();
            int grade = sc.nextInt();
            cd[i] = new Code(name, grade);
            if(grade < min){
                min = grade;
                min_flag = i;
            }
        }
        System.out.println(cd[min_flag].name+" "+cd[min_flag].grade);
    }
}