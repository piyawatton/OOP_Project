
public class VariableY extends RandomFunction
{
   
   
    

    public VariableY(){ 
        
        
    } 
    
    public String getFunctionName(){
       
        return expression;
    }
    
    public double compute(double x, double y){
        expression = "y";
        return y;
    }
    
}
