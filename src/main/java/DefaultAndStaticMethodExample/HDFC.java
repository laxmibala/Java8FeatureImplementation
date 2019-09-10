package DefaultAndStaticMethodExample;

public class HDFC implements RBI,GovernmentOffer {

    @Override
    public void withdraw() {
        System.out.println("HDFC withdraw");
    }

    @Override
    public void deposit() {
        System.out.println("HDFC deposit");
    }


    public static void calulateHDFCInterest() {
        System.out.println("HDFC Interest");
    }

    public void getLoanOffer(){
        RBI.super.getLoanOffer();
    }
}
