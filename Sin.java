

public class Sin extends Function
{
   
    RandomFunction function;

   
    public Sin(RandomFunction function){
       
        this.function = function;
    }

    public String getFunctionName(){
        
        return "Sin (Pi * "+this.function.getFunctionName()+")";
    }
    
    public double compute(){
        return Math.sin(pi* this.function.compute());
    }
}
