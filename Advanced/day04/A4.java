import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class A4 extends JFrame { //Container 
	JButton b; //UI Component
	void init(){
		b = new JButton("");
		add(b);
        ActionListener listener = new A4Handler(this);
        b.addActionListener(listener);

		setUI();
	}
	void setUI(){
		setTitle("제2회 천하제일 퀴즈대회");
		setSize(600, 300);
		setVisible(true);
		setLocation(400, 200);
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		A4 a4 = new A4();
		a4.init();
	}
}
