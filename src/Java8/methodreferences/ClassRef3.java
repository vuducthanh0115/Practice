package Java8.methodreferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassRef3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(-3);
        list.add(0);
        Collections.sort(list, Integer::compareTo);
        /*Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/
        list.forEach(System.out::println);
    }
}
