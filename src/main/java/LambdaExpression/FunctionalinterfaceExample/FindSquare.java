package LambdaExpression.FunctionalinterfaceExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public abstract class FindSquare {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(0);
        list.add(15);
        list.add(3);

        list.stream().forEach(i->{
            System.out.println("square of "+i+" is "+(i*i));
        });

        Integer[] integers =list.stream().toArray(Integer[]::new);
        Stream.of(integers).forEach(System.out::println);


        SquareOperation<Double> squareNum1= n-> String.valueOf(n*n);
        System.out.println(squareNum1.findSquare(4.1));

        SquareOperation<String> stringSquareOperation= n-> n.concat(n);
        System.out.println(stringSquareOperation.findSquare("Ram"));
    }

    public abstract void add();
}
