package DefaultAndStaticMethodExample;

public class SBP implements SBI {
    @Override
    public void withdraw() {
        System.out.println("SBP withdraw");
    }

    @Override
    public void deposit() {
        System.out.println("SBP deposit");
    }


}
