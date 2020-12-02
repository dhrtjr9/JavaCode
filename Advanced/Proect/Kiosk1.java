import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
import javax.swing.table.*;
import javax.swing.JOptionPane;

class Kiosk1 extends JFrame implements ActionListener{
   Container cp;
   JPanel pN, pS, pL, pR;
   JPanel pC1, pC2, pC3, pC4, pC5, pC6, pC7; // ��� �г�
   JPanel pSp, pSpp, pSpN;
   JButton c1,c2,c3,c4,c5; //ī�װ�
   JButton menuList1[], menuList2[], menuList3[], menuList4[], menuList5[], menuList6[], menuList7[];
   JButton resetBtn, orderBtn;
   JTable tb, tb2;
   JScrollPane js;
   DefaultTableModel model, model2;
   JOptionPane jp;

   String[] ordering = {"�޴�", "����", "����"};
   String[][] orderdata = {};
   
   JLabel cal;
   JTextField jf;
   JTextArea ja;

   void init(){
      setPanel();
      
      setUI();
   }

   void setPanel(){
      pN = new JPanel();
      pC1 = new JPanel();
      pC2 = new JPanel();
      pC3 = new JPanel();
      pC4 = new JPanel();
      pC5 = new JPanel();
      pC6 = new JPanel();
      pC7 = new JPanel();
      pS = new JPanel();
      pL = new JPanel();
      pR = new JPanel();
      pSp = new JPanel();
      pSpp = new JPanel();
      pSpN = new JPanel();
      c1 = new JButton("ī�װ�1");
      c2 = new JButton("ī�װ�2");
      c3 = new JButton("ī�װ�3");
      c4 = new JButton("ī�װ�4");
      c5 = new JButton("ī�װ�5");   
      model = new DefaultTableModel(orderdata, ordering);
     model2 = new DefaultTableModel();
      tb = new JTable(model);
     tb2 = new JTable(model2);
      js = new JScrollPane(tb);
      resetBtn = new JButton("����");
      orderBtn = new JButton("�ֹ��ϱ�");
      //cal = new JLabel("ORDERING                                                                                    ");
      jf = new JTextField(30);
      

      //pC1
      menuList1 = new JButton[9];
      for(int i = 0; i < menuList1.length; i++){
         menuList1[0]  = new JButton("�Ƹ޸�ī��");
         menuList1[1]  = new JButton("ī���");
         menuList1[2]  = new JButton("īǪġ��");
         menuList1[3]  = new JButton("�ٴҶ��");
         menuList1[4]  = new JButton("ļ��Ḷ���ƶ�");
         menuList1[5]  = new JButton("��ī��");
         menuList1[6]  = new JButton("���ν����");
         menuList1[7]  = new JButton("�ݵ���");
         menuList1[8]  = new JButton("��ũ����");
      }

      //pC2
      menuList2 = new JButton[9];
      for(int i = 0; i < menuList2.length; i++){
      menuList2[0]  = new JButton("��1");
      menuList2[1]  = new JButton("��2");
      menuList2[2]  = new JButton("��3");
      menuList2[3]  = new JButton("��4");
      menuList2[4]  = new JButton("��5");
      menuList2[5]  = new JButton("��6");
      menuList2[6]  = new JButton("��7");
      menuList2[7]  = new JButton("��8");
      menuList2[8]  = new JButton("��9");
      }
      for(int i = 0; i < menuList2.length; i++){
         pC2.add(menuList2[i]);
      }

      //pC3
      menuList3 = new JButton[9];
      for(int i = 0; i < menuList3.length; i++){
        menuList3[0]  = new JButton("����Ʈ1");
      menuList3[1]  = new JButton("����Ʈ2");
      menuList3[2]  = new JButton("����Ʈ3");
      menuList3[3]  = new JButton("����Ʈ4");
      menuList3[4]  = new JButton("����Ʈ5");
      menuList3[5]  = new JButton("����Ʈ6");
      menuList3[6]  = new JButton("����Ʈ7");
      menuList3[7]  = new JButton("����Ʈ8");
      menuList3[8]  = new JButton("����Ʈ9");
      }
      for(int i = 0; i < menuList3.length; i++){
         pC3.add(menuList3[i]);
      }
      //pC4
      menuList4 = new JButton[9];
      for(int i = 0; i < menuList4.length; i++){
        menuList4[0]  = new JButton("���̵�1");
      menuList4[1]  = new JButton("���̵�2");
      menuList4[2]  = new JButton("���̵�3");
      menuList4[3]  = new JButton("���̵�4");
      menuList4[4]  = new JButton("���̵�5");
      menuList4[5]  = new JButton("���̵�6");
      menuList4[6]  = new JButton("���̵�7");
      menuList4[7]  = new JButton("���̵�8");
      menuList4[8]  = new JButton("���̵�9");
      }
      for(int i = 0; i < menuList4.length; i++){
         pC4.add(menuList4[i]);
      }
      //pC5
      menuList5 = new JButton[9];
      for(int i = 0; i < menuList5.length; i++){
        menuList5[0]  = new JButton("��Ÿ1");
      menuList5[1]  = new JButton("��Ÿ2");
      menuList5[2]  = new JButton("��Ÿ3");
      menuList5[3]  = new JButton("��Ÿ4");
      menuList5[4]  = new JButton("��Ÿ5");
      menuList5[5]  = new JButton("��Ÿ6");
      menuList5[6]  = new JButton("��Ÿ7");
      menuList5[7]  = new JButton("��Ÿ8");
      menuList5[8]  = new JButton("��Ÿ9");
      }
      for(int i = 0; i < menuList3.length; i++){
         pC5.add(menuList5[i]);
      }
 
            
      //��ư ũ�� ����
      js.setPreferredSize(new Dimension(480, 100));   /////////////////
      resetBtn.setPreferredSize(new Dimension(94, 70));
      orderBtn.setPreferredSize(new Dimension(94, 70));

      cp = getContentPane();
      //cp.setLayout(new BorderLayout());
      pN.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 0));
      pC1.setLayout(new GridLayout(3, 3));
      pC2.setLayout(new GridLayout(3, 3));
      pC3.setLayout(new GridLayout(3, 3));
      pC4.setLayout(new GridLayout(3, 3));
      pC5.setLayout(new GridLayout(3, 3));
      pC6.setLayout(new GridLayout(3, 3));
      pC7.setLayout(new GridLayout(3, 3));
      pS.setLayout(new BorderLayout());
      pR.setLayout(new GridLayout(1, 1));              
      pL.setLayout(new GridLayout(1, 1));
      pSpp.setLayout(new GridLayout(2,0));
      pSpN.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));

      // ���� ���� 4
      pN.setBorder(BorderFactory.createEmptyBorder(100,0,10,0));
      //pS.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

      // NORTH ����
      cp.add(pN, BorderLayout.NORTH);
      pN.add(c1);
      pN.add(c2);
      pN.add(c3);
      pN.add(c4);
      pN.add(c5);
      
      // CENTER ����
      cp.add(pC1, BorderLayout.CENTER);
      for(int i = 0; i < menuList1.length; i++){
         pC1.add(menuList1[i]);
      }
      


      // LEFT ����
      cp.add(pL, BorderLayout.WEST);
      
      // RIGHT ����
      cp.add(pR, BorderLayout.EAST);
      
      // SOUTH ����
      jf.setBackground(new Color(50, 100, 100));
      jf.setForeground(Color.white);
      jf.setOpaque(true);
      jf.setFont(new Font("Arial", Font.BOLD, 20));
      jf.setBounds(0,0,100,0);
      

      
      cp.add(pS, BorderLayout.SOUTH);
      pS.add(pSp,BorderLayout.CENTER);
     ////////
      pSp.add(js);
     pSp.add(tb2);
      pS.add(pSp,BorderLayout.EAST);
      pSp.add(pSpp);
      pSpp.add(resetBtn);
      pSpp.add(orderBtn);
      pS.add(pSpN, BorderLayout.NORTH);
      pSpN.add(jf);

      c1.addActionListener(this);
      c2.addActionListener(this);
      c3.addActionListener(this);
      c4.addActionListener(this);
      c5.addActionListener(this);

     resetBtn.addActionListener(this);
     orderBtn.addActionListener(this);
      menuList1[0].addActionListener(this); menuList1[1].addActionListener(this); menuList1[2].addActionListener(this); menuList1[3].addActionListener(this); menuList1[4].addActionListener(this); menuList1[5].addActionListener(this); menuList1[6].addActionListener(this); menuList1[7].addActionListener(this); menuList1[8].addActionListener(this); 
     menuList2[0].addActionListener(this); menuList2[1].addActionListener(this); menuList2[2].addActionListener(this); menuList2[3].addActionListener(this); menuList2[4].addActionListener(this); menuList2[5].addActionListener(this); menuList2[6].addActionListener(this); menuList2[7].addActionListener(this); menuList2[8].addActionListener(this); 
     menuList3[0].addActionListener(this); menuList3[1].addActionListener(this); menuList3[2].addActionListener(this); menuList3[3].addActionListener(this); menuList3[4].addActionListener(this); menuList3[5].addActionListener(this); menuList3[6].addActionListener(this); menuList3[7].addActionListener(this); menuList3[8].addActionListener(this); 
     menuList4[0].addActionListener(this); menuList4[1].addActionListener(this); menuList4[2].addActionListener(this); menuList4[3].addActionListener(this); menuList4[4].addActionListener(this); menuList4[5].addActionListener(this); menuList4[6].addActionListener(this); menuList4[7].addActionListener(this); menuList4[8].addActionListener(this); 
     menuList5[0].addActionListener(this); menuList5[1].addActionListener(this); menuList5[2].addActionListener(this); menuList5[3].addActionListener(this); menuList5[4].addActionListener(this); menuList5[5].addActionListener(this); menuList5[6].addActionListener(this); menuList5[7].addActionListener(this); menuList5[8].addActionListener(this);
   }

   void setUI(){
      setTitle("Kiosk");
      setSize(600, 900);
      setVisible(true);
      setLocationRelativeTo(null);
      setResizable(false);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public void actionPerformed(ActionEvent e){
      Object obj = e.getSource();
      if(obj == resetBtn){//��üǶ��
         DefaultTableModel m = (DefaultTableModel)tb.getModel();
         m.setRowCount(0);
      }

      if(obj == orderBtn){
        int rowCont = tb.getRowCount();
        int sum =0;
         for(int i=0;i<rowCont; i++) {
            sum += Integer.valueOf((String)tb.getValueAt(i, 2));
         }
         System.out.println("�� �ݾ�: " + sum);
         jf.setText(String.valueOf(" �� �ݾ� : "+sum));
         jf.setFont(new Font("�������", Font.BOLD, 20));
        }

      if(obj == c1){
         pC2.setVisible(false);
         pC3.setVisible(false);
         pC4.setVisible(false);
         pC5.setVisible(false);
         pC1.setVisible(true);
         cp.add(pC1);
      }else if(obj == c2){
         pC1.setVisible(false);
         pC3.setVisible(false);
         pC4.setVisible(false);
         pC5.setVisible(false);
         pC2.setVisible(true);
         cp.add(pC2);
      }else if(obj == c3){
         pC1.setVisible(false);
         pC2.setVisible(false);
         pC4.setVisible(false);
         pC5.setVisible(false);
         pC3.setVisible(true);
         cp.add(pC3);
      }else if(obj == c4){
         pC1.setVisible(false);
         pC2.setVisible(false);
         pC3.setVisible(false);
         pC5.setVisible(false);
         pC4.setVisible(true);
         cp.add(pC4);
      }else if(obj == c5){
         pC1.setVisible(false);
         pC2.setVisible(false);
         pC3.setVisible(false);
         pC4.setVisible(false);
         pC5.setVisible(true);
         cp.add(pC5);

     }

      String inputMenu = e.getActionCommand();
      System.out.println("inputMenu :" + inputMenu);
      int idx = isExistData(tb, inputMenu);
      String[] add = new String[9];

      if(obj == menuList1[0]){
        addRow(idx, 1000, inputMenu, add);
      }
      else if(obj == menuList1[1]){
        addRow(idx, 10000, inputMenu, add);
      }
      else if(obj == menuList1[2]){
         addRow(idx, 3000, inputMenu, add);
      }
      else if(obj == menuList1[3]){
         addRow(idx, 3000, inputMenu, add);
      }
      else if(obj == menuList1[4]){
         addRow(idx, 3000, inputMenu, add);
      }
      else if(obj == menuList1[5]){
         addRow(idx, 3000, inputMenu, add);
      }
      else if(obj == menuList1[6]){
         addRow(idx, 3000, inputMenu, add);
      }
      else if(obj == menuList1[7]){
         addRow(idx, 3000, inputMenu, add);
      }
      else if(obj == menuList1[8]){
         addRow(idx, 3000, inputMenu, add);
      }
      else if(obj == menuList2[0]){
         addRow(idx, 3000, inputMenu, add);
      }
      else if(obj == menuList2[1]){
         addRow(idx, 3000, inputMenu, add);
      }
      else if(obj == menuList2[2]){
         addRow(idx, 3000, inputMenu, add);
      }
     else if(obj == menuList2[3]){
         addRow(idx, 3000, inputMenu, add);
      }
     else if(obj == menuList2[4]){
         addRow(idx, 3000, inputMenu, add);
      }
     else if(obj == menuList2[5]){
         addRow(idx, 3000, inputMenu, add);
      }
     else if(obj == menuList2[6]){
         addRow(idx, 3000, inputMenu, add);
      }
     else if(obj == menuList2[7]){
         addRow(idx, 3000, inputMenu, add);
      }
     else if(obj == menuList2[8]){
        addRow(idx, 3000, inputMenu, add);
      }
     else if(obj == menuList3[0]){
        addRow(idx, 4000, inputMenu, add);
      }
     else if(obj == menuList3[1]){
        addRow(idx, 5000, inputMenu, add);
      }
     else if(obj == menuList3[2]){
        addRow(idx, 6000, inputMenu, add);
      }
     else if(obj == menuList3[3]){
        addRow(idx, 8000, inputMenu, add);
      }
     else if(obj == menuList3[4]){
        addRow(idx, 6500, inputMenu, add);
      }
     else if(obj == menuList3[5]){
        addRow(idx, 4500, inputMenu, add);
      }
     else if(obj == menuList3[6]){
        addRow(idx, 3500, inputMenu, add);
      }
     else if(obj == menuList3[7]){
        addRow(idx, 9800, inputMenu, add);
      }
     else if(obj == menuList3[8]){
        addRow(idx, 7700, inputMenu, add);
      }
     else if(obj == menuList4[0]){
        addRow(idx, 6600, inputMenu, add);
      }
     else if(obj == menuList4[1]){
        addRow(idx, 100000, inputMenu, add);
      }
     else if(obj == menuList4[2]){
        addRow(idx, 100000, inputMenu, add);
      }
     else if(obj == menuList4[3]){
        addRow(idx, 100000, inputMenu, add);
      }
     else if(obj == menuList4[4]){
        addRow(idx, 100000, inputMenu, add);
      }
     else if(obj == menuList4[5]){
        addRow(idx, 100000, inputMenu, add);
      }
     else if(obj == menuList4[6]){
        addRow(idx, 100000, inputMenu, add);
      }
     else if(obj == menuList4[7]){
        addRow(idx, 100000, inputMenu, add);
      }
     else if(obj == menuList4[8]){
        addRow(idx, 100000, inputMenu, add);
      }
     else if(obj == menuList5[0]){
        addRow(idx, 3300, inputMenu, add);
      }
     else if(obj == menuList5[1]){
        addRow(idx, 100000, inputMenu, add);
      }
     else if(obj == menuList5[2]){
       addRow(idx, 100000, inputMenu, add);
      }
     else if(obj == menuList5[3]){
       addRow(idx, 4300, inputMenu, add);
      }
     else if(obj == menuList5[4]){
        addRow(idx, 5300, inputMenu, add);
      }
     else if(obj == menuList5[5]){
        addRow(idx, 7600, inputMenu, add);
      }
     else if(obj == menuList5[6]){
        addRow(idx, 5500, inputMenu, add);
      }
     else if(obj == menuList5[7]){
        addRow(idx, 100000, inputMenu, add);
      }
     else if(obj == menuList5[8]){
        addRow(idx, 100000, inputMenu, add);
      }
           
   }

   public void addRow(int idx, int payment, String inputMenu, String[] add) {
         if(idx != -1){
         model.getValueAt(idx, 1);
            String pre_count = (String)model.getValueAt(idx, 1);
            int tmp_count = Integer.parseInt(pre_count);
            String new_count = Integer.toString(tmp_count + 1);
      
            String pre_amount = (String) model.getValueAt(idx, 2);
            int tmp_amount = Integer.parseInt(pre_amount);
            String new_amount = Integer.toString(tmp_amount + payment);

            model.setValueAt(new_count, idx, 1);
            model.setValueAt(new_amount, idx, 2);
         }else{
            add[0] = inputMenu;
            add[1] = "1";
            add[2] = Integer.toString(payment);
            model.addRow(add);
         }
   }

    public int isExistData(JTable tb, String menu) { //���� �̹� ���� ��Ʈ�� �޴��� ��ư //������ jtable ���°� �����ִ� , ��Ʈ�� �޴����� ���� ã�����ϴ� �޴��� ����,
        // ������� ����ִ� �ο�(��) ���� ŭ ������ ���鼭
        for (int i = 0; i < tb.getRowCount(); i++) { //���� ���̺��� �� ������ŭ ������.
            // �ش� �޴� �̸��� Jtable�� �����ϸ�
            if (tb.getValueAt(i, 0) == menu) { //i�� ���� 0��° �÷��̾� //���̰��� ���� ����
                // �� ��° ������ ��ȯ
                return i;
            }
        }
        // ���� �ش� �޴� �̸��� Jtable�� ���� ���� ������ -1 ��ȯ
        return -1;
    }



   public static void main(String[] args) {
      Kiosk1 ki = new Kiosk1();
      ki.init();
      
   }
}