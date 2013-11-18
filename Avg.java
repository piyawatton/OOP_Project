

public class Avg extends Function
{
    // instance variables - replace the example below with your own
    RandomFunction function;
    
    
    /**
     * Constructor for objects of class Cos
     */
    public Avg(RandomFunction function)
    {
        // initialise instance variables
        this.function = function;
        
    }

    public String getFunctionName(){
        
        return expression;
    }
    
    public double compute(double x, double y){
        expression = "Avg("+this.function.getFunctionName()+"),"+this.function.getFunctionName()+")";
        return ((this.function.compute(x,y))*(this.function.compute(x,y)))/2;
        
    }
}
