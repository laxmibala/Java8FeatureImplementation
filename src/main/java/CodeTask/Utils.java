package CodeTask;

import java.util.Comparator;
import java.util.stream.Collectors;

public class Utils {
    public static Comparator<String> byStringContaingECharacter=
        Comparator.comparing(s -> !s.contains("e"));


    public static Comparator<String> byStringFirstCharacter=
         Comparator.comparing(s -> String.valueOf(s.charAt(0)));


    public static Comparator<String> byStringLength=
            Comparator.comparing(s ->s.length());

}
