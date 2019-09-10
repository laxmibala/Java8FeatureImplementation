package DefaultAndStaticMethodExample;

public class SBMBank extends SBM{

    public static void main(String[] args) {
        RBI.addAadharNumber();
        SBI sbi =new SBM();
        sbi.SBIOffer();
        sbi.deposit();
        sbi.withdraw();
        sbi.getLoanOffer();
        SBI.calculateSBIInterest();


    }


}
