import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestSwing {
    private final static int BUTTON_SIZE = 5;

    public static void main(String[] args) {

 

        JFrame fr = new JFrame("This «¡∑π¿”");
        JPanel pn = new JPanel();

        JButton[] bt = new JButton[BUTTON_SIZE];
        int[] width = {100};
        int[] height = {50};
        pn.setLayout(null);

        for (int i = 0; i < BUTTON_SIZE; i++) {
            bt[i] = new JButton("Button" + i);
            bt[i].setBounds(100, 50, width[i], height[i]);
            pn.add(bt[i]);
        }

        fr.setContentPane(pn);

        fr.setSize(500, 500);
        fr.setVisible(true);
    }
}