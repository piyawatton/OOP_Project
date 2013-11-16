
public class VariableY extends RandomFunction
{
   
    private double y;
    public VariableY(double num){ 
        expression = "y";
        this.y = num;
    }

    public String getFunctionName(){
       
        return expression;
    }
    
    public double compute(){
        return this.y;
    }
    
}
