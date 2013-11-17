

public class Average extends Function
{
    // instance variables - replace the example below with your own
    RandomFunction function;
    RandomFunction function1;
    

    /**
     * Constructor for objects of class Cos
     */
    public Average(RandomFunction function ,RandomFunction function1)
    {
        // initialise instance variables
        this.function = function;
        this.function1 = function1;
    }

    public String getFunctionName(){
        
        return "Cos (Pi * "+this.function.getFunctionName()+")";
    }
 
    public double compute(double x, double y){
       // return Math.avg(this.function.compute());
       return  (this.function.compute(x,y)+this.function.compute(x,y))/2;
    }
}
