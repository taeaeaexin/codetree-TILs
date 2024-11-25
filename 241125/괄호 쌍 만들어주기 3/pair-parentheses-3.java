import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        String A = sc.next();
        int count = 0;
        char arr[] = A.toCharArray();
        for(int i = 0 ; i < A.length() ; i++){
            for(int j = i+1 ; j < A.length() ; j++){
                if(arr[i] == '(' && arr[j] == ')'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}