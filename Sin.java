

public class Sin extends Function
{
   
    RandomFunction function;
    
   
    public Sin(RandomFunction function){
        
        this.function = function;
    }

    public String getFunctionName(){
        
        return "Sin (y*Pi*"+this.function.getFunctionName()+")";
    }
    
    public double compute(double x, double y){
        expression = "Sin (y*Pi*"+this.function.getFunctionName()+")";
        return Math.sin(pi*y* pi * this.function.compute(x,y));
    }
}

