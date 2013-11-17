

public class XdevideY extends RandomFunction
{
   
    

    
   
    
    public XdevideY(){
        
    }

    public String getFunctionName(){
     
        return expression;
    }
    
    public double compute(double x, double y){
        expression = "x/y";
        return x/y;
    }
    
}
