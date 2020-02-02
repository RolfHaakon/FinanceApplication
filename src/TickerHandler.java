import java.lang.reflect.Array;
import java.util.*;

public class TickerHandler {

    private int counter;

//    public HashMap<String, Integer> tickerFinder = new HashMap<String, Integer>();
//    public ArrayList<String> tickerStart = new ArrayList<String>();
//    public ArrayList<String> tickerIntra = new ArrayList<String>();


    public static void main(String[] args) {

        Map<String, List<String>> map = new HashMap<String, List<String>>();
        map.put("TRVX", new ArrayList<String>(Arrays.asList("2018-01-01", "2020-01-01", "10", "8")));
        map.put("NANO", new ArrayList<String>(Arrays.asList("2018-01-01", "2020-01-01", "40", "34")));

        for (Map.Entry<String, List<String>> ee : map.entrySet()) {
            String key = ee.getKey();
            List<String> values = ee.getValue();
            System.out.println(key+ " " + values);
        }
    }

    public static void addTicker(String Ticker){

    }

}
