

public class Rint extends Function
{
    // instance variables - replace the example below with your own
    RandomFunction function;
    
    
    /**
     * Constructor for objects of class Cos
     */
    public Rint(RandomFunction function)
    {
        // initialise instance variables
        this.function = function;
        
    }

    public String getFunctionName(){
        
        return expression;
    }
    
    public double compute(double x, double y){
        expression = "Rint(x*"+this.function.getFunctionName()+")";
        return Math.rint(x*y*this.function.compute(x,y));
        
    }
}
