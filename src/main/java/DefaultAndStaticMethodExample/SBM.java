package DefaultAndStaticMethodExample;

public class SBM implements SBI,GovernmentOffer{
    @Override
    public void withdraw() {
        System.out.println("SBM withdraw");
    }

    @Override
    public void deposit() {
        System.out.println("SBM deposit");
    }

    @Override
    public void getLoanOffer() {
        GovernmentOffer.super.getLoanOffer();
    }


}
