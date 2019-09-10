package AnonymousClassExample;

public class Subtract {
    static int a;
    static int b;
    Subtract(int a,int b){
        this.a=a;
        this.b=b;
    }

    public static void main(String[] args) {
        Subtract subtract =new Subtract(8,9);
        Calculator calculator = ()->{
            int diff =a-b;
            System.out.println("difference= "+diff);
        };

        calculator.calculate();
    }



}
