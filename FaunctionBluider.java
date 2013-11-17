
public class FaunctionBluider
{
    private boolean hasValue;
    private double result;
    RandomFunction randomFunctionRed;
    RandomFunction randomFunctionGreen;
    RandomFunction randomFunctionBlue;

    public FaunctionBluider()
    {
        hasValue = false;
        result = 0;
    }

    
    public double getFunction(double x, double y, int deepLevel){
        /*randomFunctionRed = new VariableX(y);
        randomFunctionRed = new Sin(randomFunctionRed);
        randomFunctionRed = new Cos(randomFunctionRed);
        randomFunctionRed = new Sin(randomFunctionRed);
        randomFunctionRed = new Cos(randomFunctionRed);*/
        


        if(deepLevel == 0){
          //if(!hasValue){
            int random = (int)(Math.random()*2);  
            if(random == 0){
                randomFunctionRed = new VariableY(y);
                
             
            }else{
                randomFunctionRed = new VariableX(x);
                
            }
            //hasValue = true;
          //}
        }else{
           int random = (int)(Math.random()*2);  
           if(random == 0){
               randomFunctionRed = new Sin(randomFunctionRed);
                 
           }else{
               randomFunctionRed = new Cos(randomFunctionRed);
               
            }
            //function = new Cos(function);
            getFunction(x,  y, deepLevel-1);
        }
        
        
        
        
        
        
        return randomFunctionRed.compute();
        
    }
    
    public String functionName(){
        return randomFunctionRed.getFunctionName();
    }
    
}
