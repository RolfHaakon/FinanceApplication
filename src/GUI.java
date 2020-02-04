import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUI {
    private JFrame frame = new JFrame("Finance Application");
    ArrayList arrayList;

    protected GUI(){
        frame.setSize(1200,800);
        frame.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hello");
        arrayList.add("Hello");
        arrayList.add("Hello");
        arrayList.add("Hello");
        for (String str : arrayList ) {
            JLabel j1 = new JLabel(str);
            panel.add(j1);
        }
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
        //frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.repaint();
    }
    protected void table(){
        // Table headers
        String[] colums = new String[] {
                "Ticker", "Date of Purchase", "Avg Purchase price", "Current Date", "Current Purchase price"
        };
        // Data for the table

    }




}
