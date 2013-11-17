
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
  
  private static final int EQUATION_FONT_SIZE = 16;
  private static final int UPPER_LEFT_CORNER = 100;
  
  public Frame(){
    setTitle("Assignment 4 - Random Art");
    setLayout(new BorderLayout());
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
    // create panel with buttons
    
    thePanel = new ArtPanel();
    
    
    
    topPanel = new JPanel();
    topPanel.setLayout(new GridLayout(3,0));
    
    
    button = new JButton("Generate the random art");
    JPanel buttonPanel = new JPanel();
    buttonPanel.add(button);
    
    Event buttonClick = new Event();
    button.addActionListener(buttonClick);
    
    // create the label with the current random expression
    
    add(topPanel);
    
    
    //theCurrentExpression.setFont(new Font("Serif", Font.PLAIN, EQUATION_FONT_SIZE));
    
    
  
    
    
    add(thePanel, BorderLayout.CENTER);
   

    
    add(buttonPanel, BorderLayout.SOUTH);
    add(topPanel, BorderLayout.NORTH);
    
    textRed = new TextField("textRed");
    textGreen = new TextField("textGreen");
    textBlue = new TextField("textBlue");
    topPanel.add(textRed);
    topPanel.add(textGreen);
    topPanel.add(textBlue);
    setSize(300,400);
    
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
    setSize(500,500);  
    setVisible(true);
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