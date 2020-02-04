import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String API_Key = "";
        String urlString = "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY_ADJUSTED&symbol=MSFT&apikey=demo";
        //GetRequest.StockData(urlString);

        new GUI();


        }
}
