package StreamApiExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethodExample {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("AAA");
        strings.add("AAAAA");
        strings.add("ABC");
        strings.add("A");
        strings.add("AA");


        System.out.println("***************Strings after default sorting***************");
        List<String> defaultSorting =strings.stream().sorted().collect(Collectors.toList());
        defaultSorting.stream().forEach(s->{
            System.out.println(s);
        });

        System.out.println("***************Strings after sorting by string length***************");
       List<String> sortedString= strings.stream().sorted(((s1,s2)->{
            int l1=s1.length();
            int l2=s2.length();
            if(l1<l2)return -1;
            else if(l1>l2)return 1;
            else return s1.compareTo(s2);
        })).collect(Collectors.toList());

        sortedString.stream().forEach(s->{
            System.out.println(s);
        });



    }
}
