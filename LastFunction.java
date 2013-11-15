
/**
 * Write a description of class LastFunction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LastFunction extends ExpressNode
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;
    
    /**
     * Constructor for objects of class LastFunction
     */
    public LastFunction()
    {
        // initialise instance variables
        
    }

    
    public double evaluate(double x, double y){
        int random = (int)(Math.random()*3);
        if(random == 0){
            return x;
        }else if(random ==1){
            return y;
        }else{
            return x*y;
        }
        
    }
    
    
    public String getExpression(){
        return null;
    }
}
