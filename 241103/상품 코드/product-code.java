import java.util.Scanner;
class Product{
    String name;
    int code;

    public Product(String name, int code){
        this.name = name;
        this.code = code;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = sc.nextInt();
        Product product1 = new Product("codetree", 50);
        Product product2 = new Product(str, num);
        System.out.println("product "+product1.code+" is "+product1.name);
        System.out.println("product "+product2.code+" is "+product2.name);
    }
}