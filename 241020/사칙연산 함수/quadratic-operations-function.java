import java.util.Scanner;
public class Main {
    public static int func1(int a, int b){
        return a+b;
    }

    public static int func2(int a, int b){
        return a-b;
    }

    public static int func3(int a, int b){
        return a/b;
    }

    public static int func4(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a, c, result;
        a = sc.nextInt();
        char o = sc.next().charAt(0);
        c = sc.nextInt();

        if(o == '+'){
            System.out.println(a+" "+o+" "+c+" = "+func1(a, c));
        }else if(o == '-'){
            System.out.println(a+" "+o+" "+c+" = "+func2(a, c));
        }else if(o == '/'){
            System.out.println(a+" "+o+" "+c+" = "+func3(a, c));
        }else if(o == '*'){
            System.out.println(a+" "+o+" "+c+" = "+func4(a, c));
        }else{
            System.out.println("False");
        }
    }
}