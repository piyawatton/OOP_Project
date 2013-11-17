

public class Sin extends Function
{
   
    RandomFunction function;
    
   
    public Sin(RandomFunction function){
        
        this.function = function;
    }

    public String getFunctionName(){
        
        return "Sin (Pi * "+this.function.getFunctionName()+")";
    }
    
    public double compute(double x, double y){
        
        return Math.sin(y*x+y*pi*x* pi * this.function.compute(x,y));
    }
}

