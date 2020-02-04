public class Main {

    public static void main(String[] args) {
        String apiKey = GetKey.fromPath("/home/rolf/IdeaProjects/FinanceApplication/Data/API-KEY.txt");
        String StockFile = "/home/rolf/IdeaProjects/FinanceApplication/Data/StockData.txt";
        String urlString = "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY_ADJUSTED&symbol=MSFT&apikey=demo";
        //GetRequest.StockData(urlString);
//        System.out.println(apiKey);

        //new GUI();
        StockInfoList.loadCSV(StockFile);
        StockInfoList.printTickerList();


    }
}
