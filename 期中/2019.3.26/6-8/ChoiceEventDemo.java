import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// 實作ItemListener介面
public class ChoiceEventDemo extends java.awt.Frame implements ItemListener,ActionListener,MouseListener {
	
 static int[] A1 = { 10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 21, 22, 35, 23, 24, 27, 28, 29, 32, 30, 33 };
 static char[] A2 = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'M', 'N', 'O', 'P', 'Q', 'T', 'U', 'V', 'W', 'X', 'Z' };		

  java.awt.Choice choice;
  Choice choice1 = new Choice();
  Choice choice2 = new Choice();
  Label label1 = new Label("", Label.CENTER); 
  Label label3 = new Label("性別", Label.CENTER); 
  Label label4 = new Label("地區", Label.CENTER); 
  Label label5 = new Label("", Label.CENTER);//生分證
  
  java.awt.Checkbox[] checkbox = new Checkbox[3];
  
  Button button = new Button("產生");

  public static void main(String args[]){ 
    new ChoiceEventDemo();
  }
  
  // 建構函式
  public ChoiceEventDemo() {
    super("Choice Event Demo");

    String[] items = { "台北市", "台中市", "基隆市", "台南市", "高雄市", "台北縣", "宜蘭縣", "桃園縣",
      "嘉義市", "新竹縣", "苗栗縣", "台中縣", "南投縣", "彰化縣", "新竹市", "雲林縣",
      "嘉義縣", "台南縣", "高雄縣", "屏東縣", "花蓮縣", "台東縣", "金門縣", "澎湖縣",
      "陽明山", "連江縣"};
	  
	String[] items1 = { "男生", "女生"};  
    
    final int row = 7;    // 列
    final int column = 1; // 行

    // 定義 Layout Manager 為 GridLayout
    setLayout(new GridLayout(row, column));
	
	
    
    // 設定背景顏色
    label1.setBackground(new Color(255,0,0));
    add(label1);

    java.awt.Panel panel1 = new Panel();
	add(label4);
    // 註冊 ItemListener
    choice1.addItemListener(this);
    
    // 設定Choice選取項目（Item），項目index自0開始。
    for (int i=0; i < items.length; i++)    
      choice1.add(items[i]);

    // 選取第3個選項項目，項目index自0開始。
    choice1.select(3);
	choice1.addMouseListener(this);
    panel1.add(choice1);
    add(panel1);
	
	java.awt.Panel panel2 = new Panel();
	add(label3);
	
	
	choice2.addItemListener(this);
    
    // 設定Choice選取項目（Item），項目index自0開始。
    for (int i=0; i < items1.length; i++)    
      choice2.add(items1[i]);

    // 選取第3個選項項目，項目index自0開始。
    choice2.select(1);
	choice2.addMouseListener(this);
    panel2.add(choice2);
    add(panel2);
	
	
	add(button);
	add(label5);
	button.addActionListener(this);
	
  
    // 設定視窗的大小
    this.setSize(350, 300);

    // Center the frame
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = this.getSize();

    if (frameSize.height > screenSize.height)
      frameSize.height = screenSize.height;

    if (frameSize.width > screenSize.width)
      frameSize.width = screenSize.width;

    this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

    // 顯示視窗
    this.setVisible(true);

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }

  public void itemStateChanged(ItemEvent e) {
    // 取得產生項目事件的物件
  
  }
  
  
 //按鈕 
  public void actionPerformed(ActionEvent e){

	Gen();
 }
 
 //滑鼠事件
 public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getSource().equals (choice1))
	label1.setText("請選擇地區...." );
	else
	label1.setText("請選擇性別...." );
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
