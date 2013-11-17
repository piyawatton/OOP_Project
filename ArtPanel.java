import javax.swing.*;
import java.awt.*;

class ArtPanel extends JPanel   {
  
  // CS324e students. 
  // Add class constants and instance variables here
  
  public static final int SIZE = 400;

  private static final double pi = Math.PI;
  public String result = "Test ";
  
  RandomFunction randomFunctionRed;
  RandomFunction randomFunctionGreen;
  RandomFunction randomFunctionBlue;
  FaunctionBluider builder;
  
  
  private int randomRed;
  private int randomGreen;
  private int randomBlue;
  
  private String randomRedExp;
  private String randomGreenExp;
  private String randomBlueExp;
  
  
  
  public ArtPanel(){ 
    setPreferredSize(new Dimension(SIZE, SIZE));
    
    builder = new FaunctionBluider();
  }
  
  
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
    
    int random = (int)(Math.random()*2);  
          
    
    for(int i=0 ; i<getWidth() ; i++) {
      for(int j=0 ; j<getHeight() ; j++) {
        
        double x = ((((double) i) / getWidth()) * 2.0) -1.0;
        double y = ((((double) j) / getHeight()) * 2.0) -1.0;
        
        /*if(!hasValue){
          if(random == 0){
             randomFunctionRed = new VariableY(y);
             
          }else{
             randomFunctionRed = new VariableX(x);
             
          }
          hasValue = true;
        }*/

        /*randomFunctionRed = new VariableX(y);
        randomFunctionRed = new Sin(randomFunctionRed);
        randomFunctionRed = new Cos(randomFunctionRed);
        randomFunctionRed = new Sin(randomFunctionRed);
        randomFunctionRed = new Cos(randomFunctionRed);*/
       
        //createFunction(randomFunctionRed, x,  y, 4);

        
        randomFunctionGreen = new VariableX(x);
        randomFunctionGreen = new Cos(randomFunctionGreen);
        randomFunctionGreen = new Sin(randomFunctionGreen);
       
        randomFunctionBlue = new VariableY(y);
        randomFunctionBlue = new Cos(randomFunctionBlue);
        randomFunctionBlue = new Sin(randomFunctionBlue);
        randomFunctionBlue = new Cos(randomFunctionBlue);
       
    
        //int red   = exprToInt(randomFunctionRed.compute());
        int red   = exprToInt(builder.getFunction( x,  y, 4));
        int green = exprToInt(randomFunctionGreen.compute());
        int blue  = exprToInt(randomFunctionBlue.compute());
        

       System.out.println(builder.functionName());
       //System.out.println(x);
       //System.out.println(randomFunctionRed.compute());
        
     
        
        
        Color color = new Color(red,green,blue);
        g2.setColor(color);
        g2.fillRect(i,j,1,1);
      }
    }
    
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
  
 
  public void createFunction(RandomFunction function,double x, double y, int deepLevel){
       
      int random = (int)(Math.random()*2);
      if(random == 0){
         function = new VariableX(x);
      }else{
         function = new VariableY(y);   
      }
      
      for(int i = 0; i <= deepLevel; i++){
          int randomF = (int)(Math.random()*2);
          if(randomF == 0){
            function = new Cos(function);
          }else{
            function = new Sin(function);   
          }
          
        }
      
      
      /*if(deepLevel == 0){
          
          /*int random = (int)(Math.random()*2);  
          if(random == 0){
            function = new VariableY(y);
            //function = new Cos(randomFunctionRed);
             
          }else{
             function = new VariableX(x);
             //function = new Sin(randomFunctionRed);
          }
          function = new VariableX(x);
        }else{
           int random = (int)(Math.random()*2);  
           if(random == 0){
               function = new Sin(randomFunctionRed);
                 
           }else{
               function = new Cos(randomFunctionRed);
               
            }
            function = new Cos(function);
            createFunction(function, x,  y, deepLevel-1);
        }*/
      
        
      
    }
  
  
  
  
  
  
  
    
  public void changePic(){

    
  }
  
}