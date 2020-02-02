import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;

public class GUI {
    private JFrame frame = new JFrame("Finance Application");
    ArrayList arrayList;

    protected GUI(){
        frame.setSize(1200,800);
        frame.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        //for (String str : ) {
            //JLabel j1 = new JLabel(str);
          //  panel.add(j1);
        //}
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.repaint();
    }




}
