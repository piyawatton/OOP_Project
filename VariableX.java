

public class VariableX extends RandomFunction
{
   
   

    
   
    
    public VariableX(){
        
    }

    public String getFunctionName(){
     
        return expression;
    }
    
    public double compute(double x, double y){
        expression = "x";
        return x;
    }
    
}
