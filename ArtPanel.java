import javax.swing.*;
import java.awt.*;

class ArtPanel extends JPanel   {
  
  // CS324e students. 
  // Add class constants and instance variables here
  
  public static final int SIZE = 400;
  public static final int NUM_COLOR_OPTIONS = 2;
  private static final double pi = Math.PI;
  public String result = "Test ";
  
  ExpressBuilder randomFunction;
  
  private int randomRed;
  private int randomGreen;
  private int randomBlue;
  
  private String randomRedExp;
  private String randomGreenExp;
  private String randomBlueExp;
  
  public ArtPanel(){ 
    setPreferredSize(new Dimension(SIZE, SIZE));
    
    // samples of interesting grayscale formulas
    // xCySM
    // yCCSxxMSSAS, interesting 4 deep formula
    // yxMSSCS, another interesting 4 deep formula
    // yCSSSxxACySyyAAACM, yet another interesting 4 deep
    // xxMCxyMSASS one more good 4 deep
    // xCxSAxCSMSSSQSCyCSSSCMS
    

    
    //exp = new RandomExpression("A");
    // CS324e students: add and change as necessary
  }
  
  
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
    
    
    // CS324e students: add and change as necessary
    /***
    g2.setColor(Color.GREEN);
    g2.fillRect(0, 0, getWidth() - 1, getHeight() - 1);
    */
    
    for(int i=0 ; i<getWidth() ; i++) {
      for(int j=0 ; j<getHeight() ; j++) {
        
        double x = ((((double) i) / getWidth()) * 2.0) - 1.0;
        double y = ((((double) j) / getHeight()) * 2.0) - 1.0;
        
        //****Fix Function
        /**
         * int red   = exprToInt(exprRed(x,y));
         * int green = exprToInt(exprGreen(x,y));
         * int blue  = exprToInt(exprBlue(x,y));
         */
        
        randomFunction = new ExpressBuilder();
        randomFunction.insert(new Function(x,y));
        
        int red   = exprToInt(randomFunction.getResult());
        int green = exprToInt(randomFunction.getResult());
        int blue  = exprToInt(randomFunction.getResult());
        

       
        
        //*****Random Function

        
        //expRed.getResult(x,y) is random function of red.
        
        
        Color color = new Color(red,green,blue);
        g2.setColor(color);
        g2.fillRect(i,j,1,1);
      }
    }
    
  }
  
  
  public String getExpressionAsString() {
    
    //ph
    // CS324e students: add and change as necessary
    
    return this.result;
  }
  
  //*****Fixed function 
  //******If you want to random function, go to class RandomExpression.
  
  public double exprRed(double num1, double num2) {
    double x = (double)num1;
    double y = (double)num2;
    
    return cos(x*(sin(y)*pi*avg(pi*sin(x))));
  }
  
  public double exprGreen(double num1, double num2) {
    double x = (double)num1;
    double y = (double)num2;
    
    return  sin(x*(cos(y)*pi*sin(pi*sin(x))));
    
  }
  
  public double exprBlue(double num1, double num2) {
    double x = (double)num1;
    double y = (double)num2;
    
    return sin(x*(cos(y)*pi*avg(pi*sin(x))));
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
  
  public double cos(double num) {
    return Math.cos(num);
  }
  
  public double sin(double num) {
    return Math.sin(num);
  }
  
  public double sqrt(double num){
      return Math.sqrt(num);
    }
  
  public double abs(double num){
      return Math.abs(num);
    }
    
  public void changePic(){

    
  }
  
}