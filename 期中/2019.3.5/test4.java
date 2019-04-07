import java.awt.*;
import java.awt.event.*;

public class test4 extends java.awt.Frame {

  public static void main(String args[]){
    new test4();
  }
  
  // 建構函式
  public test4() {
    super("Grid Bag Layout Demo");

    Button button;
    GridBagLayout gridbaglayout = new GridBagLayout();
    GridBagConstraints gbConstraints = new GridBagConstraints();
    
    // 定義 Layout Manager 為 GridBagLayout
    setLayout(gridbaglayout);
    
    // 同時改變物件寬度與高度以填滿顯示區域之水平與垂直方向
    gbConstraints.fill = GridBagConstraints.BOTH;
    gbConstraints.weightx = 1;
	gbConstraints.weighty = 1;

    

	
    button = new Button("1");
    // 設定Grid Bag Layout中物件的限制
    gridbaglayout.setConstraints(button, gbConstraints);
    add(button);
    
    button = new Button("2");
    gridbaglayout.setConstraints(button, gbConstraints);
    add(button);
    
	button = new Button("3");
    gridbaglayout.setConstraints(button, gbConstraints);
    add(button);
	button = new Button("4");
    gridbaglayout.setConstraints(button, gbConstraints);
    add(button);
	
	gbConstraints.gridwidth = GridBagConstraints.REMAINDER;
	button = new Button("5");
    gridbaglayout.setConstraints(button, gbConstraints);
    add(button);
	
	gbConstraints.gridwidth = GridBagConstraints.RELATIVE; 
    button = new Button("6");
    gridbaglayout.setConstraints(button, gbConstraints);
    add(button);
	
	gbConstraints.gridwidth = GridBagConstraints.REMAINDER;
	button = new Button("7");
     gridbaglayout.setConstraints(button, gbConstraints);
    add(button);
	
	 // 設定物件配置時所佔據區域列的數目
    gbConstraints.gridwidth = 2;          
    // 設定物件配置時所佔據區域行的數目
    gbConstraints.gridheight = 1;
    // 依加權比例分配物件間垂直方向額外之區域
	button = new Button("8");
    gridbaglayout.setConstraints(button, gbConstraints);
    add(button);
	
	gbConstraints.gridwidth = GridBagConstraints.REMAINDER;
	button = new Button("9");
     gridbaglayout.setConstraints(button, gbConstraints);
    add(button);
	
	 // 設定物件配置時所佔據區域列的數目
    gbConstraints.gridwidth = 2;          
    // 設定物件配置時所佔據區域行的數目
    gbConstraints.gridheight = 7;
    // 依加權比例分配物件間垂直方向額外之區域
    gbConstraints.weighty = 1.0;
    button = new Button("10");
    gridbaglayout.setConstraints(button, gbConstraints);
    add(button);
    
	
	gbConstraints.weighty = 0.0;       
    gbConstraints.gridwidth = GridBagConstraints.REMAINDER; 
    gbConstraints.gridheight = 1;      
    button = new Button("11");
    gridbaglayout.setConstraints(button, gbConstraints);
    add(button);
	
	gbConstraints.weighty = 0.0;       
    gbConstraints.gridwidth = GridBagConstraints.REMAINDER; 
    gbConstraints.gridheight = 1;  
	button = new Button("12");
    gridbaglayout.setConstraints(button, gbConstraints);
    add(button);
	
	
	gbConstraints.weighty = 0.0;       
    gbConstraints.gridwidth = GridBagConstraints.REMAINDER; 
    gbConstraints.gridheight = 1;  
	button = new Button("13");
    gridbaglayout.setConstraints(button, gbConstraints);
    add(button);
	
	
	gbConstraints.gridx=3;
	gbConstraints.gridy=6;
	button = new Button("14");
    gridbaglayout.setConstraints(button, gbConstraints);
    add(button);
	
	gbConstraints.gridwidth = 1;
	gbConstraints.gridheight = 1;
	gbConstraints.gridx=2;
	gbConstraints.gridy=7;
	button = new Button("15");
    gridbaglayout.setConstraints(button, gbConstraints);
    add(button);
	
	
	gbConstraints.gridwidth = 1;
	gbConstraints.gridheight = 1;
	gbConstraints.gridx=3;
	gbConstraints.gridy=8;
	button = new Button("16");
    gridbaglayout.setConstraints(button, gbConstraints);
    add(button);


	
	gbConstraints.gridx=4;
	gbConstraints.gridy=9;
	button = new Button("17");
    gridbaglayout.setConstraints(button, gbConstraints);
    add(button);

    // 設定視窗的大小
    this.setSize(300, 300);

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