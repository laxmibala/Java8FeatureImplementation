package CodeTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public Double average(List<Integer> list){
        Double avg;
        avg=list.stream().mapToInt(i->i).average().getAsDouble();
        return avg;
    }
    public String getString(List<Integer> list){
        String str= list.stream().map(i -> (i % 2 == 0) ? "e" + i : "o" + i).collect(Collectors.joining(","));
        return str;
    }

    public List<String> search(List<String> list){
        return list.stream().filter(s->s.startsWith("a")&&s.length()==3).collect(Collectors.toList());
    }

    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(2,3,8,9);
       Test test =new Test();

       //problem 1
       Double avg= test.average(list);
       System.out.println("Average of numbers are:"+avg);

       //problem 2
       String evenOddString=test.getString(list);
       System.out.println(evenOddString);

       //problem 3
        List<String> stringList= Arrays.asList("saa","abb","cae","a","axx","bebbb","aba","abeb");
        List<String> stringList1 =test.search(stringList);
        System.out.println(stringList1);

        System.out.println("Original String list");
        System.out.println(stringList);

        //problem4
        //sort string list by length by shortest to longest
        List<String> sortedString= stringList.stream().sorted((s1,s2)->{
            int l1=s1.length();
            int l2=s2.length();
            if(l1<l2)return -1;
            else if(l1>l2)return 1;
            else return s1.compareTo(s2);
        }).collect(Collectors.toList());
        System.out.println("String after sorting by length shortest to longest:");
        System.out.println(sortedString);

        //sort string list by length by shortest to longest
        List<String> revSortedString= stringList.stream().sorted(Comparator.comparing(s->s.length())).collect(Collectors.toList());
        System.out.println("String list after sorting by length longest to shortest:");
        System.out.println(revSortedString);

        //sort string list alphabetically by first character only
       List<String> charwiseSortedList= stringList.stream().sorted(Comparator.comparing(s -> String.valueOf(s.charAt(0)))).collect(Collectors.toList());
       System.out.println("String after sorting by first Character:");
       System.out.println(charwiseSortedList);


        //sort Strings that contain “e” first, everything else second
        List<String> sortedList =stringList.stream().sorted(Comparator.comparing(s->!s.contains("e"))).collect(Collectors.toList());
        System.out.println("String list after sorting by contains 'e' Character:");
        System.out.println(sortedList);

        String[] arr ={"saa","abb","cae","a","axx","bebbb","aba","abeb"};
        Arrays.sort(arr,Utils.byStringContaingECharacter);
        System.out.println(Arrays.asList(arr));
        Arrays.sort(arr,Utils.byStringLength);
        System.out.println(Arrays.asList(arr));
        Arrays.sort(arr,Utils.byStringFirstCharacter);
        System.out.println(Arrays.asList(arr));


    }
}
