import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// ��@ItemListener����
public class ChoiceEventDemo extends java.awt.Frame implements ItemListener,ActionListener,MouseListener {
	
 static int[] A1 = { 10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 21, 22, 35, 23, 24, 27, 28, 29, 32, 30, 33 };
 static char[] A2 = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'M', 'N', 'O', 'P', 'Q', 'T', 'U', 'V', 'W', 'X', 'Z' };		

  java.awt.Choice choice;
  Choice choice1 = new Choice();
  Choice choice2 = new Choice();
  Label label1 = new Label("", Label.CENTER); 
  Label label3 = new Label("�ʧO", Label.CENTER); 
  Label label4 = new Label("�a��", Label.CENTER); 
  Label label5 = new Label("", Label.CENTER);//�ͤ���
  
  java.awt.Checkbox[] checkbox = new Checkbox[3];
  
  Button button = new Button("����");

  public static void main(String args[]){ 
    new ChoiceEventDemo();
  }
  
  // �غc�禡
  public ChoiceEventDemo() {
    super("Choice Event Demo");

    String[] items = { "�x�_��", "�x����", "�򶩥�", "�x�n��", "������", "�x�_��", "�y����", "��鿤",
      "�Ÿq��", "�s�˿�", "�]�߿�", "�x����", "�n�뿤", "���ƿ�", "�s�˥�", "���L��",
      "�Ÿq��", "�x�n��", "������", "�̪F��", "�Ὤ��", "�x�F��", "������", "���",
      "�����s", "�s����"};
	  
	String[] items1 = { "�k��", "�k��"};  
    
    final int row = 7;    // �C
    final int column = 1; // ��

    // �w�q Layout Manager �� GridLayout
    setLayout(new GridLayout(row, column));
	
	
    
    // �]�w�I���C��
    label1.setBackground(new Color(255,0,0));
    add(label1);

    java.awt.Panel panel1 = new Panel();
	add(label4);
    // ���U ItemListener
    choice1.addItemListener(this);
    
    // �]�wChoice������ء]Item�^�A����index��0�}�l�C
    for (int i=0; i < items.length; i++)    
      choice1.add(items[i]);

    // �����3�ӿﶵ���ءA����index��0�}�l�C
    choice1.select(3);
	choice1.addMouseListener(this);
    panel1.add(choice1);
    add(panel1);
	
	java.awt.Panel panel2 = new Panel();
	add(label3);
	
	
	choice2.addItemListener(this);
    
    // �]�wChoice������ء]Item�^�A����index��0�}�l�C
    for (int i=0; i < items1.length; i++)    
      choice2.add(items1[i]);

    // �����3�ӿﶵ���ءA����index��0�}�l�C
    choice2.select(1);
	choice2.addMouseListener(this);
    panel2.add(choice2);
    add(panel2);
	
	
	add(button);
	add(label5);
	button.addActionListener(this);
	
  
    // �]�w�������j�p
    this.setSize(350, 300);

    // Center the frame
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = this.getSize();

    if (frameSize.height > screenSize.height)
      frameSize.height = screenSize.height;

    if (frameSize.width > screenSize.width)
      frameSize.width = screenSize.width;

    this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

    // ��ܵ���
    this.setVisible(true);

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }

  public void itemStateChanged(ItemEvent e) {
    // ���o���Ͷ��بƥ󪺪���
  
  }
  
  
 //���s 
  public void actionPerformed(ActionEvent e){

	Gen();
 }
 
 //�ƹ��ƥ�
 public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getSource().equals (choice1))
	label1.setText("�п�ܦa��...." );
	else
	label1.setText("�п�ܩʧO...." );
}

@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	label1.setText("" );
}

@Override
public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
}

@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

public void Gen()
  {
    int[] arrayOfInt = new int[11];
    
    arrayOfInt[0] = (A1[this.choice1.getSelectedIndex()] / 10);
    arrayOfInt[1] = (A1[this.choice1.getSelectedIndex()] % 10);
    if (this.choice2.getSelectedIndex()==0) {
      arrayOfInt[2] = 1;
    } else if (this.choice2.getSelectedIndex()==1) {
      arrayOfInt[2] = 2;
    }
	int i;
    for (i = 3; i <= 10; i++) {
      arrayOfInt[i] = ((int)(Math.random() * 10.0D));
    }
    i = arrayOfInt[9] * 1 + arrayOfInt[8] * 2 + arrayOfInt[7] * 3 + arrayOfInt[6] * 4 + arrayOfInt[5] * 5 + arrayOfInt[4] * 6 + arrayOfInt[3] * 7 + arrayOfInt[2] * 8 + arrayOfInt[1] * 9 + arrayOfInt[0] * 1;
    if (i % 10 == 0) {
      arrayOfInt[10] = 0;
    } else {
      arrayOfInt[10] = (10 - i % 10);
    }
    String str = Character.toString(A2[this.choice1.getSelectedIndex()]);
    for (int j = 2; j <= 10; j++) {
      str = str + Integer.toString(arrayOfInt[j]);
    }
    this.label5.setText(str);
  }
 
 
}
