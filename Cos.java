

public class Cos extends Function
{
    // instance variables - replace the example below with your own
    RandomFunction function;

    /**
     * Constructor for objects of class Cos
     */
    public Cos(RandomFunction function)
    {
        // initialise instance variables
        this.function = function;
    }

    public String getFunctionName(){
        
        return "Cos (Pi * "+this.function.getFunctionName()+")";
    }
    
    public double compute(){
        return Math.cos( pi*this.function.compute());
    }
}
