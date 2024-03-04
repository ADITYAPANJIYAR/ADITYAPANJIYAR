package designpkg;

public class LoanApplication {

    private int id;
    private String applicationNumber;
    private double amount;
    private double tenure;
    private double productId;

private LoanApplication(LoanApplicationBuilder builder){

    this.id=builder.id;
    this.amount= builder.amount;
    this.productId= builder.productId;
    this.applicationNumber=builder.applicationNumber;
    this.tenure=builder.tenure;

}



    static class LoanApplicationBuilder{
        private int id;
        private String applicationNumber;
        private double amount;
        private double tenure;
        private double productId;
//constructor to initialize mandatory argument
        public LoanApplicationBuilder(String applicationNumber){
            this.applicationNumber=applicationNumber;

        }

        //initialize optional arguments via methods
LoanApplicationBuilder id(int id){
            this.id=id;
            return this;
}
        LoanApplicationBuilder tenure(double tenure){
            this.tenure=tenure;
            return this;
        }
        LoanApplicationBuilder amount(double amount){
            this.amount=amount;
            return this;
        }
        LoanApplicationBuilder productId(int productId){
            this.productId=productId;
            return this;
        }

//to retrun loanapplication
       LoanApplication  build(){
            return new LoanApplication(this);
        }


    }
}
