import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static <T> List<T>
    removeElements(List<T> l, Predicate<T> p)
    {
        l.removeIf(x -> p.test(x));
        return l;
    }

    public static void main(String[] args) {
        List<String> l = new ArrayList<>(
                Arrays.asList("Geeks",
                        null,
                        "forGeeks",
                        null,
                        "A computer portal"));
        System.out.println("List with null values: " + l);

        Predicate<String> isNull = i -> (i == null);
        l = removeElements(l, isNull);
        System.out.println("List with null values removed: " + l);
    }
}