import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class B1 extends JFrame implements ActionListener {
	JButton bN, bS, bW, bE, bC;
	JButton bPC, bPE, bPW; 
	Container cp;
	JPanel p;

	void init(){
		p = new JPanel();
		p.setLayout(new BorderLayout());
		//bPC = new JButton("�г� ����");
		//bPE = new JButton("�г� ����");
		//bPW = new JButton("�г� ����");
        p.add(bPC, BorderLayout.CENTER);
		p.add(bPE, BorderLayout.EAST);
		p.add(bPW, BorderLayout.WEST);
		bPC.addActionListener(this);

		bN = new JButton("��");
		bS = new JButton("��");
		bW = new JButton("��");
		bE = new JButton("��");
		bC = new JButton("���");
		cp = getContentPane();	
		cp.add(bN, BorderLayout.NORTH);
		cp.add(bS, BorderLayout.SOUTH);
		cp.add(bW, BorderLayout.WEST);
		cp.add(bE, BorderLayout.EAST);
		//cp.add(bC, BorderLayout.CENTER);
		cp.add(p);

		setUI();
	}
	void setUI(){
		setTitle("GUI Test Ver 1.0");
		setSize(500, 200);
		setVisible(true);
		setLocation(200, 100);
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		pln("�г� ���� Ŭ��");
	}
	void pln(String str){
		System.out.println(str);
	}
	public static void main(String[] args) {
		B1 b1 = new B1();
		b1.init();
	}
}