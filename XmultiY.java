

public class XmultiY extends RandomFunction
{
   
   

    
   
    
    public XmultiY(){
        
    }

    public String getFunctionName(){
     
        return expression;
    }
    
    public double compute(double x, double y){
        expression = "x*y";
        return x*y;
    }
    
}
