import javax.swing.*;
import java.awt.*;

class ArtPanel extends JPanel   {
  
  // CS324e students. 
  // Add class constants and instance variables here
  
  public static final int SIZE = 400;
  public static final int NUM_COLOR_OPTIONS = 2;
  private static final double pi = Math.PI;
  public String result = "Test ";
  
  RandomFunction randomFunctionRed;
  RandomFunction randomFunctionGreen;
  RandomFunction randomFunctionBlue;
  
  private int randomRed;
  private int randomGreen;
  private int randomBlue;
  
  private String randomRedExp;
  private String randomGreenExp;
  private String randomBlueExp;
  
  public ArtPanel(){ 
    setPreferredSize(new Dimension(SIZE, SIZE));

  }
  
  
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
    

    
    for(int i=0 ; i<getWidth() ; i++) {
      for(int j=0 ; j<getHeight() ; j++) {
        
        double x = ((((double) i) / getWidth()) * 2.0) - 1.0;
        double y = ((((double) j) / getHeight()) * 2.0) - 1.0;
        
     
        randomFunctionRed = new VariableX(x);
        randomFunctionRed = new Sin(randomFunctionRed);
        randomFunctionRed = new Sin(randomFunctionRed);
        randomFunctionRed = new Cos(randomFunctionRed);
        randomFunctionRed = new Cos(randomFunctionRed);
        
        randomFunctionGreen = new VariableY(y);
        randomFunctionGreen = new Sin(randomFunctionGreen);
        randomFunctionGreen = new Average(randomFunctionGreen);
        randomFunctionGreen = new Cos(randomFunctionGreen);
        
        
        randomFunctionBlue = new VariableY(y);
        randomFunctionBlue = new Cos(randomFunctionBlue);
        randomFunctionBlue = new Cos(randomFunctionBlue);
        randomFunctionBlue = new Cos(randomFunctionBlue);
        
        
        int red   = exprToInt(randomFunctionRed.compute());
        int green = exprToInt(randomFunctionGreen.compute());
        int blue  = exprToInt(randomFunctionBlue.compute());
        

       
        
        //*****Random Function

        
        //expRed.getResult(x,y) is random function of red.
        
        
        Color color = new Color(red,green,blue);
        g2.setColor(color);
        g2.fillRect(i,j,1,1);
      }
    }
    
  }
  
  
  public String getExpressionAsString() {
    
  
    return this.result;
  }
  
 
  

  public int exprToInt(double num){
    return (int)((num +1) * 255/2);
  }
  

  
  public double avg(double... num) {
    double sum = 0;
    for(int i=0 ; i<num.length ; i++) {
      sum = sum + num[i];
    }
    return sum / num.length;
  }
  
 
  
  
    
  public void changePic(){

    
  }
  
}