import java.awt.*;
import java.awt.event.*;

public class ButtonDemo1 extends java.awt.Frame implements ActionListener {
 Button button0 = new Button("New");
    Button button1 = new Button("Open");
    Button button2 = new Button("Save");
 Button button3 = new Button("Cut");
 Button button4 = new Button("Copy");
    Button button5 = new Button("Paste");
  public static void main(String args[]){
    new ButtonDemo1();
 
  }
   public void actionPerformed(ActionEvent e){

 if(e.getSource()==button0)
  System.out.println("開啟新檔");
 
 
 if(e.getSource()==button1)
  System.out.println("開啟舊檔");
 
 
 if(e.getSource()==button2)
  System.out.println("存檔");
 
  
 if(e.getSource()==button3)
  System.out.println("剪下");
 
 
 if(e.getSource()==button4)
  System.out.println("複製");
 
 
 if(e.getSource()==button5)
  System.out.println("貼上");
 }
  // 建構函式
  public ButtonDemo1(){
    super("Button Demo1");

    final int row = 3;    // 列
    final int column = 2; // 行

    // 定義 Layout Manager 為 GridLayout
    setLayout(new GridLayout(row, column));

    java.awt.Button button;
 add(button0);
 add(button1);
 add(button2);
 add(button3);
 add(button4);
 add(button5);

 button0.addActionListener(this);
 button1.addActionListener(this);
 button2.addActionListener(this);
 button3.addActionListener(this);
 button4.addActionListener(this);
 button5.addActionListener(this);
 
    // 設定視窗的大小
    this.setSize(200, 200);

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
