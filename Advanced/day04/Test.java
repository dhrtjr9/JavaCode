import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLocation(600, 300);
		frame.setPreferredSize(new Dimension(800, 300));
		Container contentPane = frame.getContentPane();

		JPanel panel = new JPanel();
		panel.setLayout(null);
		JButton btn1 = new JButton("btn1111");
		JButton btn2 = new JButton("btn2222");
		JButton btn3 = new JButton("btn3333");
		JButton btn4 = new JButton("btn4444");
		JButton btn5 = new JButton("btn5555");

		btn1.setBounds(0, 0, 100, 50);
		btn2.setBounds(10, 50, 10, 50);
		btn3.setBounds(40, 10, 20, 50);
		btn4.setBounds(0, 0, 300, 300);
		btn5.setBounds(60, 0, 20, 50);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);

		contentPane.add(panel, BorderLayout.CENTER);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}