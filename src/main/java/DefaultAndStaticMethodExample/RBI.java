package DefaultAndStaticMethodExample;

public interface RBI {

    void withdraw();
    void deposit();


    static void addAadharNumber(){
        System.out.println("Add Aadhar number");
    }

    default void getLoanOffer(){
        System.out.println("loan offer provided by RBI");
    }

    public static void main(String[] args) {
        System.out.println("This is RBI interface");
    }

}
