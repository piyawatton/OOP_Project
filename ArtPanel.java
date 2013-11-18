import javax.swing.*;
import java.awt.*;

class ArtPanel extends JPanel   {
  
  // CS324e students. 
  // Add class constants and instance variables here
  
  public static final int SIZE = 400;
  public static final int LEVEL = 6; //start from 4 to 10
  private static final double pi = Math.PI;
  public String result = "Test ";
  
  RandomFunction randomFunctionRed;
  RandomFunction randomFunctionGreen;
  RandomFunction randomFunctionBlue;
  
  RandomFunction firstFunction;
  
  static Frame tool;
  
  
  private int randomRed;
  private int randomGreen;
  private int randomBlue;
  
  public String randomRedExp;
  public String randomGreenExp;
  public String randomBlueExp;
  
  
  
  
  
  public ArtPanel(){ 
   // setPreferredSize(new Dimension(SIZE, SIZE));
    
    //builder = new FaunctionBluider();
    
    
  }
  
  
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
    
    int random = (int)(Math.random()*2);  
   
    
        randomFunctionRed = createVariable(firstFunction);
        for(int i = 0; i < (int)(Math.random()*(LEVEL+4)+4);i++){
            randomFunctionRed = createFunction(randomFunctionRed);
          
        }
 
        randomFunctionGreen = createVariable(firstFunction);
        for(int i = 0; i < (int)(Math.random()*(LEVEL+4)+4);i++){
            randomFunctionGreen = createFunction(randomFunctionGreen);
 
        }
   
        
        randomFunctionBlue = createVariable(firstFunction);
        for(int i = 0; i < (int)(Math.random()*(LEVEL+4)+4);i++){
            randomFunctionBlue = createFunction(randomFunctionBlue);
          
        }
        
      
    
    for(int i=0 ; i<getWidth() ; i++) {
      for(int j=0 ; j<getHeight() ; j++) {
        
        double x = ((((double) i) / getWidth()) * 2.0) -1.0;
        double y = ((((double) j) / getHeight()) * 2.0) -1.0;

    
        int red   = exprToInt(randomFunctionRed.compute(x,y));
        int green = exprToInt(randomFunctionGreen.compute(x,y));
        int blue  = exprToInt(randomFunctionBlue.compute(x,y));
        
       
        
        
       //System.out.println(builder.functionName());
       //System.out.println(x);
       //System.out.println(randomFunctionRed.compute(x,y));
        
        
        
        Color color = new Color(red,green,blue);
        g2.setColor(color);
        g2.fillRect(i,j,1,1);
      }
    }
        randomRedExp = randomFunctionRed.getFunctionName();
        randomGreenExp = randomFunctionGreen.getFunctionName();
        randomBlueExp = randomFunctionBlue.getFunctionName();
        
        //System.out.println(randomFunctionRed.getFunctionName());
        //System.out.println(randomFunctionGreen.getFunctionName());
       // System.out.println(randomFunctionBlue.getFunctionName());
       
       
        tool.textRed.setText("Red = "+randomRedExp);
        tool.textGreen.setText("Green = "+randomGreenExp);
        tool.textBlue.setText("Blue = "+randomBlueExp);
        
  }
  

  

  public int exprToInt(double num){
    return (int)((num +1) * 255/2);
  }
  

  
  public RandomFunction createFunction(RandomFunction function){
   int random = (int)(Math.random()*100);
 
      if(random < 35){
          function = new Cos(function);
        }else if(random < 70){
          function = new Sin(function);  
        }else if(random < 85){
          function = new Avg(function);  
        }else if(random < 90){
          function = new Tan(function);
        }else if(random < 92){
          function = new Rint(function);        
        }else{
          function = new Absolute(function);   
        }

   return function;
    }
  
  public RandomFunction createVariable(RandomFunction function){
   int random = (int)(Math.random()*100);
 
      if(random < 10){
          function = new VariableX();
        }else if(random < 20){
          function = new VariableY();  
        }else if(random < 40){
          function = new XdevideY();    
        }else if(random < 60){
          function = new XmultiY();    
        }else if(random < 80){
          function = new XplusY();    
        }else{
          function = new XminusY();    
        }
        
   return function;
    }
    
  
  
  
  
    
  public void changePic(){

    
  }
  
}