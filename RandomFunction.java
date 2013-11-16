

public abstract class RandomFunction
{
   
    String expression = "No Function";
    double function;
    
   
    public String getFunctionName()
    {
   
        return expression;
    }
    
    public abstract double compute();
}
