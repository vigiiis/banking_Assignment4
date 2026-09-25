package src.app;

public class personalLoan extends loan implements taxable {
    
    public double GetRate(){

        if (GetPrinciple() <= 500000) {

            return 15;
            
        }
        else{
            return 16;
        }

    } 
    public double getTax(){
        return  GetEmi() * 0.1;
    }
}
