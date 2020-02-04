import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class StockInfoList {

    public static List<List<String>> tickerList = new ArrayList<List<String>>();

    public static void loadCSV(String filePath) {
        int counter = 0;
        List<List<String>> records = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line = "";
            //String[] attributes = line.split(",");
            while ((line = br.readLine()) != null){
                tickerList.add(new ArrayList<String>());
                String[] values = line.split(",");
                for (int i = 0; i < values.length; i++){
                    tickerList.get(counter).add(values[i]);
                }
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printTickerList() {
        for (List list : tickerList){
            for (Object o : list){
                System.out.print(o);
            }
            System.out.println("");
        }
    }

}