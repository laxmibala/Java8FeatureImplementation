package LambdaExpression.FunctionalinterfaceExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,9,10,1);

        //using predicate interface
        Predicate<Integer> p1 =i->i%2==0;
        Predicate<Integer> p2 =i->i<5;
        for (int num :numbers) {
            if(p1.test(num))
                System.out.println("numbers which are even are: "+num);
            if(p1.and(p2).test(num))
               System.out.println("numbers which are greater than 5 and even are: "+num);
            if(p1.negate().test(num))
                System.out.println("numbers which are odd are: "+num);

        }

        //using Function Interface
        List<Integer> evenNum = numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(evenNum);




    }
}
