import java.awt.*;
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;

class UiTest extends JFrame implements ActionListener
{
	Container cp;
	JButton b1,b2,b3,b4;
	JButton bP1,bP2,bP3,bP4;
	JPanel p;
	ImageIcon img1,img2,img3,img4,ball,taecho;
	void init(){
		loadImg();
		setButton();
		setUI();
	}
	void loadImg(){
		try{
			img1 = new ImageIcon(ImageIO.read(new File("imgs/cat1.png")));
			img2 = new ImageIcon(ImageIO.read(new File("imgs/cat2.png")));
			img3 = new ImageIcon(ImageIO.read(new File("imgs/cat3.png")));
			img4 = new ImageIcon(ImageIO.read(new File("imgs/cat4.png")));
			ball = new ImageIcon(ImageIO.read(new File("imgs/ball.jpg")));
			taecho = new ImageIcon(ImageIO.read(new File("imgs/taecho.png")));
		}catch(IOException ie){}
	}
	void setButton(){
		p = new JPanel();
		bP1 = new JButton(img1);
		bP2 = new JButton(img2);
		bP3 = new JButton(img3);
		bP4 = new JButton(img4);
		bP1.addActionListener(this);
		bP2.addActionListener(this);
		bP3.addActionListener(this);
		bP4.addActionListener(this);
		p.add(bP1);p.add(bP2);p.add(bP3);p.add(bP4);
		p.setLayout(new GridLayout(2,2));
		b1 = new JButton("��");
		b2 = new JButton("��");
		b3 = new JButton("��");
		b4 = new JButton("��");
		b1.addActionListener(this);
		b3.addActionListener(this);
		cp = getContentPane();
		//UiHandler uh = new UiHandler(this);
		cp.add(b4, BorderLayout.NORTH);
		cp.add(b3, BorderLayout.SOUTH);
		cp.add(b2, BorderLayout.WEST);
		cp.add(b1, BorderLayout.EAST);
		cp.add(p);
	}
	public void actionPerformed(ActionEvent e){
		Object obj = e.getSource();
		if(obj==bP1){
			q(img1,"���",ball);
		}else if(obj==bP2){
			q(img2,"����",ball);
		}else if(obj==bP3){
			q(img3,"����",ball);
		}else if(obj==bP4){
			q(img4,"ƼƼ",ball);
		}else if(obj==b1){
			JOptionPane.showMessageDialog(null, "ũ��������� ������ ���ƿ� ��Ź�ؿ�~", "����", 
				JOptionPane.QUESTION_MESSAGE,
				taecho);
		}else if(obj==b3){
			select();
		}
	}
	void q(ImageIcon img, String str, ImageIcon ball){
		int answer = JOptionPane.showConfirmDialog(null, str+"�� ��ɰ��� �����!!", "����", 
				JOptionPane.OK_CANCEL_OPTION, 
				JOptionPane.QUESTION_MESSAGE, 
				img);
		if(answer == JOptionPane.YES_OPTION){
			JOptionPane.showMessageDialog(null, "���� �� ������", "gotcha", 
				JOptionPane.QUESTION_MESSAGE,
				ball);
		}else{
			JOptionPane.showMessageDialog(null, "���� ȥ�� ���ٿ�!");
		}
	}
	public void select(){
		String ms[] ={"���","����","����","ƼƼ"};
		int sel = JOptionPane.showOptionDialog(null,"� ���̰� ����� ���� ���ұ�?", "��â", 
			JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
			ms, ms[0]);
		JOptionPane.showMessageDialog(null, "���� "+ms[sel]+"�� ���ٴ� Ź���� �����Դϴ�.");
	}
	void setUI(){
		setTitle("Image Test");
		//setSize(500, 500);
		pack();
		setVisible(true);
		setLocation(200, 100);
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) 
	{
		UiTest ut = new UiTest();
		ut.init();
	}
}

