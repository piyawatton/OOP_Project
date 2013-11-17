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
  
  RandomFunction firstFunction;
  
  FaunctionBluider builder;
  
  
  private int randomRed;
  private int randomGreen;
  private int randomBlue;
  
  public String randomRedExp;
  public String randomGreenExp;
  public String randomBlueExp;
  
  
  
  
  
  public ArtPanel(){ 
    setPreferredSize(new Dimension(SIZE, SIZE));
    
    builder = new FaunctionBluider();
    
    
  }
  
  
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
    
    int random = (int)(Math.random()*2);  
   
    
        randomFunctionRed = createVariable(firstFunction);
        for(int i = 0; i < (int)(Math.random()*12+4);i++){
            randomFunctionRed = createFunction(randomFunctionRed);
          
        }
 
        randomFunctionGreen = createVariable(firstFunction);
        for(int i = 0; i < (int)(Math.random()*12+4);i++){
            randomFunctionGreen = createFunction(randomFunctionGreen);
 
        }
   
        
        randomFunctionBlue = createVariable(firstFunction);
        for(int i = 0; i < (int)(Math.random()*12+4);i++){
            randomFunctionBlue = createFunction(randomFunctionBlue);
          
        }
        
      
    
    for(int i=0 ; i<getWidth() ; i++) {
      for(int j=0 ; j<getHeight() ; j++) {
        
        double x = ((((double) i) / getWidth()) * 2.0) -1.0;
        double y = ((((double) j) / getHeight()) * 2.0) -1.0;

    
        int red   = exprToInt(randomFunctionRed.compute(x,y));
        int green = exprToInt(randomFunctionGreen.compute(x,y));
        int blue  = exprToInt(randomFunctionBlue.compute(x,y));
        
        //setFunctionName("red", randomFunctionRed.getFunctionName());
        //setFunctionName("green", randomFunctionGreen.getFunctionName());
        //setFunctionName("blue", randomFunctionBlue.getFunctionName());
        
        
       //System.out.println(builder.functionName());
       //System.out.println(x);
       //System.out.println(randomFunctionRed.compute(x,y));
        
        
        
        Color color = new Color(red,green,blue);
        g2.setColor(color);
        g2.fillRect(i,j,1,1);
      }
    }
        
        System.out.println(randomFunctionRed.getFunctionName());
        System.out.println(randomFunctionGreen.getFunctionName());
        System.out.println(randomFunctionBlue.getFunctionName());
        //setFunctionName("red", randomFunctionRed.getFunctionName());
        //setFunctionName("green", randomFunctionGreen.getFunctionName());
        //setFunctionName("blue", randomFunctionBlue.getFunctionName());
       
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
  
  public RandomFunction createFunction(RandomFunction function){
   int random = (int)(Math.random()*2);
 
      if(random == 0){
          function = new Cos(function);
        }else{
          function = new Sin(function);  
        }

   return function;
    }
  
  public RandomFunction createVariable(RandomFunction function){
   int random = (int)(Math.random()*2);
 
      if(random == 0){
          function = new VariableX();
        }else{
          function = new VariableY();  
        }
   return function;
    }
    
  public String getNameFunction(String color){
      if(color == "red"){
          return this.randomRedExp;
      }else if(color == "green"){
          return this.randomGreenExp;
      }else{
          return this.randomBlueExp;
      }
      
      
  }
  
  public void setNameFunction(String color, String function){
      if(color == "red"){
          this.randomRedExp = function;
      }else if(color == "green"){
          this.randomGreenExp = function;
      }else{
          this.randomBlueExp = function;
      }
      
      
  }
  
    
  public void changePic(){

    
  }
  
}