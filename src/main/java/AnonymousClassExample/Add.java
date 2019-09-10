package AnonymousClassExample;

public class Add {
    static int a;
    static int b;

    Add(int a, int b){
        this.a=a;
        this.b=b;
    }

    public static void main(String[] args) {
        Add add =new Add(4,5);
        Calculator calculator = new Calculator() {
            @Override
            public void calculate() {
                int sum =a+b;
                System.out.println("sum= "+sum);
            }

        };

        calculator.calculate();


        //using functional interface
        Add add1 =new Add(9,8);
        Calculator calculator1 =()->{
            int sum =a+b;
            System.out.println("sum= "+sum);
        };

        calculator1.calculate();


    }



}


