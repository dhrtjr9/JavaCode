import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.event.*;
	
	public class Deck extends JFrame { 
		// ���̾ƿ� �Ŵ����� �г�, �г� �ȿ� �� ���� �ʱ�ȭ�մϴ�. 
		CardLayout cardLayout = new CardLayout(); 
		JPanel[] panel = new JPanel[10]; 
		JLabel[] label = new JLabel[10]; 
		
		// ������ ������
		public Deck() { 
			makeFrame(); 
			makeCards(this); 
			setVisible(true); } 
			
		// ī�� ���̾ƿ��� ����� ������ ������ 	
		private void makeFrame() { 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			setTitle("ī�� ���̾ƿ� �ǽ�"); 
			setSize(720,270); 
			setLayout(cardLayout); 
			// 0~9������ �Է��� �޾� �̸��� �´� ī�带 ã�� ������ִ� Ű ������ 
			addKeyListener(new KeyListener() { 
				
		public void keyTyped(KeyEvent e) { 
			char input = e.getKeyChar(); 
			if ( input >= '0' && input <= '9' ) { 
				cardLayout.show(getContentPane(), ""+input); 
			} 
		} 
		
		public void keyReleased(KeyEvent e) {
		} 
		public void keyPressed(KeyEvent e) {
		} 
		
	}); 
} 

		// ī�巹�̾ƿ��� ����� �������� �޾ƿ� �г��� �߰��Ѵ�. 
		private void makeCards(JFrame frame) { 
			
			// �г� ����� 
			for (int i = 0; i < 10; i++) { 
				// ���� ���� ���� 
				int r = (int)(Math.random()*255); 
				int g = (int)(Math.random()*255); 
				int b = (int)(Math.random()*255); 
					Color color = new Color(r, g, b); 
						
						// �гο� ���� �ο� 
						panel[i] = new JPanel(); 
						panel[i].setBackground(color); } 
			// �гο� �۾� �ֱ� 
			for (int i = 0; i < 10; i++) { 
				label[i] = new JLabel(""+i); 
				//�۲� ���� 
				Font font = new Font("Times New Roman", Font.ITALIC, 30); 
				label[i].setFont(font); 
				//�гο� ���� ���� �߰��ϱ� 
				panel[i].add(label[i]); } // 0~9���� �гε鿡 ī�� ���̾ƿ��� Show �޼ҵ尡 �ν��� �� �ְ� �̸��� �ο��Ѵ�. 
				for (int i = 0; i <10; i++) { 
					frame.add(panel[i], ""+i);
				} 
			} 
			
			public static void main(String[] args) { 
				new Deck(); 
			} 
		}
