import java.util.Scanner;

class wrapper {
    int value;

    public wrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void func(wrapper a, wrapper b) {
        if(a.value > b.value){
            a.value += 25;
            b.value *= 2;
        }else{
            a.value *= 2;
            b.value += 25;
        }

        return;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        wrapper a_wr = new wrapper(a);
        wrapper b_wr = new wrapper(b);

        func(a_wr, b_wr);

        a = a_wr.value;
        b = b_wr.value;

        System.out.print(a+" "+b);
    }
}