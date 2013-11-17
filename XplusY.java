

public class XplusY extends RandomFunction
{
   
   

    
   
    
    public XplusY(){
        
    }

    public String getFunctionName(){
     
        return expression;
    }
    
    public double compute(double x, double y){
        expression = "x+y";
        return x+y;
    }
    
}
