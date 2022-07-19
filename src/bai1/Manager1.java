package bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Manager1 {
    List<Officer> list = new ArrayList<>();

    void add(Officer officer) {
        this.list.add(officer);
    }

    /*void search(String name) {
        int check = 0;
        for (Officer lists : list) {
            if (lists.getName().contains(name)) {
                System.out.println(lists);
                check++;
            }
        }
        if (check == 0) {
            System.out.println("Khong tim thay");
        }
    }*/
    public List<Officer> search(String name) {
        return this.list.stream().filter(p -> p.getName().equals(name)).collect(Collectors.toList());
    }

    void showInfo() {
        /*for (Officer lists : list) {
            System.out.println(lists.toString());
        }*/
        list.forEach(o -> System.out.println(o.toString()));
    }
}
