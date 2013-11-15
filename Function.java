
/**
 * Write a description of class Function here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Function extends ExpressNode
{
    // instance variables - replace the example below with your own
    private int data;
    private int currentLevel;
    private int recursiveLevel;
    private double result;
    private double x;
    private double y;
    
    /**
     * Constructor for objects of class Function
     */
    public Function()
    {
        // initialise instance variables
        data = 0;
        recursiveLevel = 5;
    }

     public Function(int data)
    {
        // initialise instance variables
        this.data = data;
      
    }
    
    public Function(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    
    public String getExpression(){
       return null; 
    }
    
    public double evaluate(double x, double y){
        double result = 0.0;
        int random = (int)(Math.random()*100);
            if(random < 10){
                //10% chance of creating an x node
                getX();
            }else if(random >= 10 && random < 20){
                //10% chance of creating a y node
                getY();
            }else if(random >= 20 && random < 40){
                //20% chance of creating an average(_, _, ...) node with 2 or 3 randomly-generated child expressions
                avg(getX(),getX());
            }else if(random >= 40 && random < 70){
                //30% chance of creating a sin(? * _) node with a single randomly-generated child expression
                sin(Math.PI * getX());
            }else{
                //30% chance of creating a cos(? * _) node with a single randomly-generated child expression
                cos(Math.PI * getX());
            }
        
        
        
        return result;
    }
    
    
    public void addFunction(ExpressNode ex){
        
        currentLevel++;
        if(currentLevel <= 6){
            int random = (int)(Math.random()*100);
            
            /*
            if(random < 10){
                //10% chance of creating an x node
                ex.getX();
            }else if(random >= 10 && random < 20){
                //10% chance of creating a y node
                ex.getY();
            }else if(random >= 20 && random < 40){
                //20% chance of creating an average(_, _, ...) node with 2 or 3 randomly-generated child expressions
                //ex.avg(ex.getX(),ex.getX());
            }else if(random >= 40 && random < 70){
                //30% chance of creating a sin(? * _) node with a single randomly-generated child expression
                //ex.sin(Math.PI * ex.getX());
            }else{
                //30% chance of creating a cos(? * _) node with a single randomly-generated child expression
                //ex.cos(Math.PI * ex.getX());
            }*/
        }
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
    
  
  public double reCursive(double x, double y){
      int random = (int)(Math.random()*3);
      if(recursiveLevel == 0){
          int randomXY = (int)(Math.random()*2);
          if(randomXY == 0){
              return x;
            }else{
           
                
                
                
                return y;  
            }
         
      }else if(random == 0){
          return  sin(reCursive(x,y));
      }else if(random == 2){
          return cos(reCursive(x,y));
      }else{
          recursiveLevel--;
          return sin(reCursive(x,y));
        }
        
    }
  
    public double getResult(){
        return evaluate(this.x, this.y);
    }
}
