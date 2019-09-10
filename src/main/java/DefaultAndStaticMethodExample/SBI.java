package DefaultAndStaticMethodExample;

public interface SBI extends RBI {

    default void SBIOffer() {
        System.out.println("SBI Offers");
    }
    public static void calculateSBIInterest(){
        System.out.println("SBI Interest");
    }

}
