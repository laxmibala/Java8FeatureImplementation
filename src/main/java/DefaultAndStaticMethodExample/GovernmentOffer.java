package DefaultAndStaticMethodExample;

public interface GovernmentOffer {

    default void getLoanOffer(){
        System.out.println("loan offer provided by Government");
    }
}
