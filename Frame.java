
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Frame extends JFrame {
  
  private ArtPanel thePanel;
  private JLabel theCurrentExpression;
  private JPanel topPanel;
  private JButton button;
  private String CurrentExpression;
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
    setTitle("Assignment 4 - Random Art");
    setLayout(new BorderLayout());
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    blueVar = new Color(120,249,255,200);
    blackgroundComp = new Color(0,0,0);
    fontColor = new Font("Test",Font.PLAIN,15);
    
    // create panel with buttons
    
    thePanel = new ArtPanel();
    
    
    
    topPanel = new JPanel();
    topPanel.setLayout(new GridLayout(3,0));
    
    imageIcon = new ImageIcon(getClass().getResource("Image/Button.jpg"));
    button = new JButton(imageIcon);
    //JButton btnTest = new JButton(new ImageIcon("ButtonTest.jpg"));
    button.setBackground(Color.BLACK);
    JPanel buttonPanel = new JPanel();
    imagePic = new ImageIcon(getClass().getResource("Image/NamePanel.jpg"));
    JLabel labelPic = new JLabel(imagePic);

    
    buttonPanel.setLayout(new BorderLayout());
    buttonPanel.add(button,BorderLayout.NORTH);
    buttonPanel.add(labelPic,BorderLayout.CENTER);
    buttonPanel.setBackground(blackgroundComp);
    
    
    Event buttonClick = new Event();
    button.addActionListener(buttonClick);
    
    // create the label with the current random expression
    
    add(topPanel);
    
    
    //theCurrentExpression.setFont(new Font("Serif", Font.PLAIN, EQUATION_FONT_SIZE));
    
    
  
   
    
    add(thePanel, BorderLayout.CENTER);
    

    
    add(buttonPanel, BorderLayout.EAST);
    add(topPanel, BorderLayout.NORTH);
    
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
    
      thePanel.changePic();
      //thePanel.getExpressionAsString();
      thePanel.repaint();
    }
  }
  
}