package src.app;

public class HomeLoan extends loan implements discount{
    
     
    public double GetRate(){
       
        if(GetPrinciple() <=2000000){
            return 10;
        }
        else{
            return 11;
        }
    }

    
    public double getDiscount(){
        return 0.05 * GetEmi();
    }
    
}
  