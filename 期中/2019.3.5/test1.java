import java.awt.*;
import java.awt.event.*;

public class test1 extends java.awt.Frame {

  public static void main(String args[]){
    new test1();
  }
  
  // 建構函式
  public test1() {
    super("Flow Layout Demo"); 
    // 向水平中央對齊
    FlowLayout flowlayout = new FlowLayout(FlowLayout.CENTER); 
    // 設定視窗的大小
    this.setSize(300, 100);
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
}