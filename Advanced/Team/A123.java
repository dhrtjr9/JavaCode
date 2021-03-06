import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.*;

import javax.swing.JFrame;

public class A123 {

   private JFrame frame;
		Container cp;
		JButton bs[];

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               A123 window = new A123();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public A123() {
      initialize();
   }

    /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 899, 513);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBounds(377, 119, 106, 32);
      frame.getContentPane().add(panel);
      panel.setLayout(null);
      
      JPanel quiz1 = new JPanel();
      quiz1.setBounds(379, 119, 106, 32);
      panel.add(quiz1);
      quiz1.setLayout(null);
      
      JButton btnNewButton_1 = new JButton("\uB450\uBC88\uC9F8 \uD654\uBA74");
      btnNewButton_1.setBounds(0, 0, 91, 23);
      quiz1.add(btnNewButton_1);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBounds(0, 0, 885, 476);
      frame.getContentPane().add(panel_1);
      panel_1.setLayout(null);
      
      JPanel quiz2 = new JPanel();
      quiz2.setBounds(0, 79, 885, 301);
      panel_1.add(quiz2);
      quiz2.setLayout(null);
      
      JButton btnNewButton = new JButton("\uCCAB\uBC88\uC9F8 \uD654\uBA74");
      btnNewButton.setBounds(377, 119, 106, 32);
      quiz2.add(btnNewButton);
      
      JPanel panel_2 = new JPanel();
      panel_2.setBounds(0, 0, 885, 476);
      frame.getContentPane().add(panel_2);
      panel_2.setLayout(null);
      
      JPanel quiz3 = new JPanel();
      quiz3.setBounds(0, 79, 885, 301);
      panel_2.add(quiz3);
      quiz3.setLayout(null);
      
      JButton btnNewButton_2 = new JButton("\uC138\uBC88\uC9F8 \uD654\uBA74");
      btnNewButton_2.setBounds(377, 119, 106, 32);
      quiz3.add(btnNewButton_2);
      
      JPanel panel_3 = new JPanel();
      panel_3.setBounds(0, 0, 885, 476);
      frame.getContentPane().add(panel_3);
      panel_3.setLayout(null);
      
      JPanel quiz4 = new JPanel();
      quiz4.setBounds(0, 79, 885, 301);
      panel_3.add(quiz4);
      quiz4.setLayout(null);
      
      JButton btnNewButton_3 = new JButton("\uB124\uBC88\uC9F8 \uD654\uBA74");
      btnNewButton_3.setBounds(377, 119, 106, 32);
      quiz4.add(btnNewButton_3);
      
      JPanel panel_4 = new JPanel();
      panel_4.setBounds(0, 0, 885, 476);
      frame.getContentPane().add(panel_4);
      panel_4.setLayout(null);
      
      JPanel quiz5 = new JPanel();
      quiz5.setBounds(0, 79, 885, 301);
      panel_4.add(quiz5);
      quiz5.setLayout(null);
      
      JButton btnNewButton_4 = new JButton("\uB2E4\uC12F\uBC88\uC9F8 \uD654\uBA74");
      btnNewButton_4.setBounds(377, 119, 106, 32);
      quiz5.add(btnNewButton_4);
   }
}
      //public void init() {
         // TODO Auto-generated method stub
         
     // }

	  void actionPerformed(ActionEvent e){
		Object obj = e.getSource();
		cp.remove((JButton)obj);
		
		revalidate();
		repaint();
	}
	public static void main(String args[]){
		A123 a123 = new A123();
		A123.init();
	}
};