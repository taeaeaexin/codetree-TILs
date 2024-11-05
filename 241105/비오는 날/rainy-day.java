import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Data{
    String date;
    String day;
    String weather;

    public Data(String date, String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int min = 21100000;
        int min_flag = 0;
        Data data[] = new Data[n];

        for(int i = 0 ; i < n ; i++){
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            data[i] = new Data(date, day, weather);
            
            int i_date = Integer.valueOf(date.substring(0,4)+date.substring(5,7)+date.substring(8,10));
            if(i_date < min && data[i].weather.equals("Rain")){
                min = i_date;
                min_flag = i;
            }
        }

        System.out.println(data[min_flag].date+" "+data[min_flag].day+" "+data[min_flag].weather);
    }
}