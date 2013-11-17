
public class Variable extends RandomFunction
{
    private double x;
    private double y;
    
    public Variable(double num){ 
        expression = "y";
        this.y = num;
    }

    public Variable(){ 
        expression = "y";
        
    } 
    
    public String getFunctionName(){
       
        return expression;
    }
    
    public double compute(double x, double y){
        /*int random = (int)(Math.random()*5);
        if(random == 0){
            System.out.println("y*x");
            return y*x;
            
        }else if(random == 1){
            System.out.println("y");
            return y;
            
        }else if(random == 2){
            System.out.println("x");
            return x;
            
        }else if(random == 3){
            System.out.println("y/x");
            return y/x;
           
        }else{
            System.out.println(x/y");
            return x/y;
            
        }*/
        int random = (int)(Math.random()*2);
        if(random == 0){
            System.out.println("y");
            return y;
        }else{
            System.out.println("y");
            return y;
        }
        
    }
    
}
