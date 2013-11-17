

public abstract class RandomFunction
{
   
    String expression = "No Function";
    double function;
    double factor;
   
    public String getFunctionName()
    {
   
        return expression;
    }
    
    public abstract double compute(double x, double y);
}
