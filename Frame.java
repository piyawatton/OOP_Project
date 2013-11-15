
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Frame extends JFrame {
  
  private ArtPanel thePanel;
  private JLabel theCurrentExpression;
  private JPanel topPanel;
  private JButton button;
  private String CurrentExpression;
  private TextField textRed;
  private TextField textGreen;
  private TextField textBlue;
  
  
  private static final int EQUATION_FONT_SIZE = 16;
  private static final int UPPER_LEFT_CORNER = 100;
  
  public Frame(){
    setTitle("Assignment 4 - Random Art");
    setLayout(new BorderLayout());
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
    // create panel with buttons
    
    thePanel = new ArtPanel();
    topPanel = new JPanel();
    button = new JButton("Generate the random art");
    JPanel buttonPanel = new JPanel();
    buttonPanel.add(button);
    
    Event buttonClick = new Event();
    button.addActionListener(buttonClick);
    
    // create the label with the current random expression
    
    add(topPanel);
    
    //theCurrentExpression.setLayout(new BorderLayout());
    //theCurrentExpression = new JLabel(thePanel.getExpressionAsString());
    //theCurrentExpression = new JLabel(thePanel.result);
    //theCurrentExpression.setFont(new Font("Serif", Font.PLAIN, EQUATION_FONT_SIZE));
    
    
    //topPanel.add(theCurrentExpression);
     //topPanel.add(getTextFiled(thePanel.getExpressionAsString()));
    // add components to frame
    
    
    add(thePanel, BorderLayout.CENTER);
    
    CurrentExpression = thePanel.getExpressionAsString();
    textRed = new TextField(CurrentExpression);
    topPanel.add(textRed);
    //topPanel.add(getTextFiled(CurrentExpression));

    
    add(buttonPanel, BorderLayout.SOUTH);
    add(topPanel, BorderLayout.NORTH);
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
    setVisible(true);
  }
  
  //******************************************************
  //********************Action Event**********************
  //******************************************************
  
  public class Event implements ActionListener{
    public void actionPerformed(ActionEvent e){
      //System.out.print("Clicked ");
     
      //thePanel = new ArtPanel();
     // add(thePanel);
      textRed.setText(CurrentExpression);
      thePanel.changePic();
      thePanel.getExpressionAsString();
      thePanel.repaint();
    }
  }
  
}