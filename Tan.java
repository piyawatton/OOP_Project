

public class Tan extends Function
{
    // instance variables - replace the example below with your own
    RandomFunction function;
    
    
    /**
     * Constructor for objects of class Cos
     */
    public Tan(RandomFunction function)
    {
        // initialise instance variables
        this.function = function;
        
    }

    public String getFunctionName(){
        
        return "Tan(x*Pi*"+this.function.getFunctionName()+")";
    }
    
    public double compute(double x, double y){
        expression = "Tan(x*Pi*"+this.function.getFunctionName()+")";
        return Math.sqrt(this.function.compute(x,y));
    }
}
