

public class VariableX extends RandomFunction
{
   
    private double x;

    
    public VariableX(double num){
        expression = "x";
        this.x = num;
    }
    
    public VariableX(){
        expression = "x";
    }

    public String getFunctionName(){
     
        return expression;
    }
    
    public double compute(double x, double y){
        return this.x;
    }
    
}
