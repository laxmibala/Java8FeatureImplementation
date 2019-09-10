package DefaultAndStaticMethodExample;

public class HDFCBank extends HDFC{

    public static void main(String[] args) {
       HDFC hdfc =new HDFCBank();
       hdfc.getLoanOffer();
       hdfc.deposit();
       hdfc.withdraw();
       HDFC.calulateHDFCInterest();
       RBI.addAadharNumber();

    }
}
