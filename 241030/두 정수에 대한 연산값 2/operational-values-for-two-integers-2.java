import java.util.Scanner;

class Wrapper{
    int value;

    public Wrapper(int value){
        this.value = value;
    }
}

public class Main {
    public static void func(Wrapper A, Wrapper B) {
        if(A.value > B.value){
            A.value *= 2;
            B.value += 10;
        }else{
            A.value += 10;
            B.value *= 2;
        }
        return;
    }
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        Wrapper w_A = new Wrapper(A);
        Wrapper w_B = new Wrapper(B);
        
        func(w_A, w_B);
        System.out.println(w_A.value+" "+w_B.value);
    }
}