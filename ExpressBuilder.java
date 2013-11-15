
/**
 * Write a description of class ExpressBuilder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExpressBuilder
{
    // instance variables - replace the example below with your own
    public static final int MAX_LEVEL = 6;
    private int currentLevel;
    private ExpressNode root;
    
    /**
     * Constructor for objects of class ExpressBuilder
     */
    public ExpressBuilder()
    {
        // initialise instance variables
       this.root = null;
       this.currentLevel = 0;
    }

    public void insert(ExpressNode newFunction){
      if(currentLevel <= MAX_LEVEL){  
        if(root == null){
          root = new Function();
          this.currentLevel++;
        }else{
          ExpressNode backPointer, pointer;
          backPointer = pointer = root;
          while(pointer != null){
            backPointer = pointer;
            if(pointer.getNodeLeft() != null){
              backPointer = pointer.getNodeLeft();
              
            }else{
              backPointer = pointer.getNodeRight();
            }  
          }

          backPointer.getNodeLeft().addFunction(newFunction);
          //backPointer.getNodeLeft() = new Function();
          
        }
      }
   }
  
   
   
   
   public double getResult(){
       return 0.0;
    }
}
