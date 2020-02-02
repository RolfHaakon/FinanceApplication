import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class GetRequest {

    //private String urlString;

    public GetRequest(String urlString){
        //this.urlString = urlString;
    }

    public static void StockData(String url) {

        try {
            URL rowdata = new URL(url);
            URLConnection data = rowdata.openConnection();
            Scanner input = new Scanner(data.getInputStream());
            if (input.hasNext()) // remove
                input.nextLine();  //remove

            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
        }
        catch (Exception e) {
            System.out.print(e);
        }
    }
}
