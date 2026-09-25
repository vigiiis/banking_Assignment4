package src.app;

public abstract class loan {
    
    private double principle;
    private double period;
    
    public double GetPrinciple(){
        return principle;
    }
   
    public void SetPrinciple(double principle){
        this.principle = principle;
    }
   
    public double GetPeriod(){
        return period;
    }
   
    public void SetPeriod( double period){
        this.period = period;
    }
    public abstract double GetRate();
    
    public double GetEmi(){
        return principle*(1+GetRate() *period/100)/(12*period);
    }
    
}
