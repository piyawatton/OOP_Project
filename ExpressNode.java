
/**
 * Write a description of class ExpressNode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ExpressNode
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;
    private ExpressNode left;
    private ExpressNode right;
    /**
     * Constructor for objects of class ExpressNode
     */
    public ExpressNode()
    {
        // initialise instance variables
        
        left = null;
        right = null;
    }

    
   
    public ExpressNode getNodeLeft(){
        return this.left;
    }
    
    public ExpressNode getNodeRight(){
        return this.right;
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public abstract void addFunction(ExpressNode ex);
    
    public abstract String getExpression();
    
    public abstract double evaluate(double x, double y);
    
    
}
