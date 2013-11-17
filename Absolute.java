

public class Absolute extends Function
{
    // instance variables - replace the example below with your own
    RandomFunction function;
    
    
    /**
     * Constructor for objects of class Cos
     */
    public Absolute(RandomFunction function)
    {
        // initialise instance variables
        this.function = function;
        
    }

    public String getFunctionName(){
        
        return "Absolute("+this.function.getFunctionName()+")";
    }
    
    public double compute(double x, double y){
        expression = "Absolute("+this.function.getFunctionName()+")";
        return Math.abs(this.function.compute(x,y));
    }
}
