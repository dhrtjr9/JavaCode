import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;

class B1 extends JFrame {
	Container cp;
	ImageIcon ii;
	JLabel laImg;
	JLabel laFont;
	
	B1(){
		laImg = new JLabel();
		laFont = new JLabel();
	}
	void init(){
		loadImg();
		laImg.setIcon(ii);
		cp = getContentPane();
		cp.add(laImg);

		laFont.setFont(new Font("±Ã¼­Ã¼", Font.BOLD, 30));
		laFont.setText("	²Ú²ÚÀÌÀÇ ¿Õ");
		cp.add(laFont, BorderLayout.NORTH);
	    setUI();
	}
	void loadImg(){
		//¹æ¹ý1
		/*try{
			File f = new File("imgs/da.gif");
			BufferedImage bi = ImageIO.read(f);
			ii = new ImageIcon(bi);
		}catch(IOException ie){
			pln("ÀÌ¹ÌÁö¸¦ ¸ø Ã£À½");
		}*/

        //¹æ¹ý2
		ii = new ImageIcon(getClass().getResource("imgs/didi.gif")); 
	}
	void setUI(){
		setTitle("JFileChooser Test");
		pack();
		setVisible(true);
		//setLocation(300, 100);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void pln(String str){
		System.out.println(str);
	}
	public static void main(String[] args) {
		new B1().init();
	}
}
