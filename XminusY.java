

public class XminusY extends RandomFunction
{
   
   

    
   
    
    public XminusY(){
        
    }

    public String getFunctionName(){
     
        return expression;
    }
    
    public double compute(double x, double y){
        expression = "x-y";
        return x-y;
    }
    
}
