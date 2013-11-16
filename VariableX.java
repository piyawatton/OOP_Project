

public class VariableX extends RandomFunction
{
   
    private double x;

    
    public VariableX(double num){
           expression = "x";
        this.x = num;
    }

    public String getFunctionName(){
     
        return expression;
    }
    
    public double compute(){
        return this.x;
    }
    
}
