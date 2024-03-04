package designpkg;

public class BuilderDemo {
    public static void main(String[] args) {


        LoanApplication.LoanApplicationBuilder builer=new LoanApplication.LoanApplicationBuilder("icici");


        LoanApplication loanApplication2=builer.amount(134)
                .id(234)
                .build();


        LoanApplication loanApplication=new LoanApplication.LoanApplicationBuilder("hdfc")
             //   .amount(1245)
                .id(23)
              //  .tenure(12)
                .productId(134)
                .build();

       LoanApplication loanApplication1=
                new LoanApplication.LoanApplicationBuilder("icici")
                        .id(12)
                        .build();
    }
}
