import src.app.*;
public class test {

     public static double GetTotalEmi(loan[] loans){
            double totalEmi =0 ;
            for(loan a : loans){
                totalEmi += a.GetEmi(); 
            }

            return totalEmi;
            
        }
        public static double GetTotalDiscount(loan[] loans){
           double totalDiscount =0 ;
            for(loan a : loans){
                 if (a instanceof discount) {
                    totalDiscount += ((discount) a).getDiscount();
                 }
            } 
            return totalDiscount ; 
        }
        public static double GetTotalTax(loan[] loans){
            double totalTax =0 ;
            for(loan a : loans){
                if(a instanceof taxable){
                    totalTax += ((taxable) a).getTax() ;
                }
            }
            return totalTax;
        }

    public static void main(String[] args) {

       
        HomeLoan h1 = new HomeLoan();
        personalLoan p1 = new personalLoan();
        HomeLoan h2 = new HomeLoan();
        personalLoan p2 = new personalLoan();

        p1.SetPeriod(2);
        h1.SetPeriod(3);
        p1.SetPrinciple(200000);
        h1.SetPrinciple(900340);
        p2.SetPeriod( 2);
        h2.SetPeriod(5);
        p2.SetPrinciple(2001210);
        h2.SetPrinciple(204532);

        loan[] loans = {p1, p2, h1, h2};

        System.out.println("Personal Loan 1");
        System.out.println("EMI  = " + p1.GetEmi());
        System.out.println("Rate = " + p1.GetRate());

        System.out.println();

        System.out.println("Personal Loan 2");
        System.out.println("EMI  = " + p2.GetEmi());
        System.out.println("Rate = " + p2.GetRate());

        System.out.println();

        System.out.println("Home Loan 1");
        System.out.println("EMI  = " + h1.GetEmi());
        System.out.println("Rate = " + h1.GetRate());

        System.out.println();

        System.out.println("Home Loan 2");
        System.out.println("EMI  = " + h2.GetEmi());
        System.out.println("Rate = " + h2.GetRate());

        System.out.println();
        System.out.println("Total EMI      = " + GetTotalEmi(loans));
        System.out.println("Total Tax      = " + GetTotalTax(loans));
        System.out.println("Total Discount = " + GetTotalDiscount(loans));


    }
}
