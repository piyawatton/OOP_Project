
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Frame extends JFrame {
  
  private ArtPanel thePanel;
  
  private JPanel topPanel;
  private JButton button;
  private JButton buttonPrint;
  private JPanel buttonPanel;
  private JLabel labelPic;
 
  static TextField textRed;
  static TextField textGreen;
  static TextField textBlue;
  private String redFunction;
  private String greenFunction;
  private String blueFunction;
  
  private Color blueVar;
  private Color blackgroundComp;
  private Font fontColor;
  private ImageIcon imagePic;
  private ImageIcon imageIcon;
  
  public Frame(){
    setTitle("OOP-Project Group 19");
    
    
    setLayout(new BorderLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    blueVar = new Color(120,249,255,200);
    blackgroundComp = new Color(0,0,0);
    
    fontColor = new Font("Test",Font.PLAIN,15);
    
    
    //Create ArtPanel
    thePanel = new ArtPanel();
    
    
    
    
    
    //********East Panel of frame******************** 
    buttonPanel = new JPanel();
    imageIcon = new ImageIcon(getClass().getResource("Image/Button.jpg"));
    button = new JButton(imageIcon);
    button.setBackground(Color.BLACK);
    
    buttonPrint = new JButton(new ImageIcon(getClass().getResource("Image/ButtonPrint.jpg")));
    buttonPrint.setBackground(Color.BLACK);
    
    
    imagePic = new ImageIcon(getClass().getResource("Image/NamePanel.jpg"));
    labelPic = new JLabel(imagePic);


    buttonPanel.setLayout(new BorderLayout());
    buttonPanel.add(button,BorderLayout.NORTH);
    buttonPanel.add(labelPic,BorderLayout.CENTER);
    buttonPanel.add(buttonPrint, BorderLayout.SOUTH);
    buttonPanel.setBackground(blackgroundComp);
    
    
    Event buttonClick = new Event();
    button.addActionListener(buttonClick);
    
    Event buttonP = new Event();
    buttonPrint.addActionListener(buttonP);
    
    //********End of East Panel ********************** 
    
    
    
    //************Top panel, show Expression ************
    
    topPanel = new JPanel();
    topPanel.setLayout(new GridLayout(3,0));
    
    textRed = new TextField("textRed");
    textRed.setFont(fontColor);
    textRed.setBackground(blackgroundComp);
    textRed.setForeground(blueVar);
    
    textGreen = new TextField("textGreen");
    textGreen.setFont(fontColor);
    textGreen.setBackground(blackgroundComp);
    textGreen.setForeground(blueVar);
    
    textBlue = new TextField("textBlue");
    textBlue.setFont(fontColor);
    textBlue.setBackground(blackgroundComp);
    textBlue.setForeground(blueVar);
    
    topPanel.add(textRed);
    topPanel.add(textGreen);
    topPanel.add(textBlue);
    

    
    //****************End of top panel*******************
    
    
    
    add(thePanel, BorderLayout.CENTER);    
    add(buttonPanel, BorderLayout.EAST);
    add(topPanel, BorderLayout.NORTH);

  }
  

  
  
  public TextField getTextFiled(String name){
    TextField result = new TextField(name);
    
    return result;
    
  }
  
  
  public JButton getButton(String label, final boolean makeColor){
    JButton result = new JButton(label);
    
    
    return result;
  }
  
  
  
  public void start(){
    setSize(600,650);  
    setVisible(true);
    setResizable(false);
  }
  
  //******************************************************
  //********************Action Event**********************
  //******************************************************
  
  public class Event implements ActionListener{
    public void actionPerformed(ActionEvent e){
    
      
      if (e.getSource() == button){
        thePanel.changePic();
        thePanel.repaint();
      }else if (e.getSource() == buttonPrint){
        System.out.println(textRed.getText());
        System.out.println(textGreen.getText());
        System.out.println(textBlue.getText());
        System.out.println("___________________________________________________________________________________");
        System.out.println("");
      }
    }
  }
  
}