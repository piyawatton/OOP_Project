
public class VariableY extends RandomFunction
{
   
    private double y;
    public VariableY(double num){ 
        expression = "y";
        this.y = num;
    }

    public VariableY(){ 
        expression = "y";
        
    } 
    
    public String getFunctionName(){
       
        return expression;
    }
    
    public double compute(double x, double y){
        return this.y;
    }
    
}
