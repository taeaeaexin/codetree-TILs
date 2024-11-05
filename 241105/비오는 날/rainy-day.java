import java.util.Scanner;

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
        String min_date = "9999-99-99";
        int n = sc.nextInt();
        Data data[] = new Data[n];
        Data ans = new Data("","","");

        for(int i = 0 ; i < n ; i++){
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            data[i] = new Data(date, day, weather);

            if(weather.equals("Rain") && date.compareTo(min_date) < 0){
                min_date = date;
                ans = new Data(date, day, weather);
            }
        }

        System.out.println(ans.date+" "+ans.day+" "+ans.weather);
    }
}