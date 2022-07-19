package bai3;

import java.util.ArrayList;
import java.util.List;

public class Manager3 {
    List<Block> block = new ArrayList<>();

    public void add(Block blocks) {
        this.block.add(blocks);
    }

    public void showInfor() {
        this.block.forEach(blocks -> System.out.println(blocks.toString()));
    }

    public void searchId(String id) {
        /*int check = 0;
        for (Block blocks : block) {
            if (blocks.getId().contains(id)) {
                System.out.println(blocks);
                check++;
            }
        }
        if (check == 0) {
            System.out.println("Khong tim thay");
        }*/
        this.block.stream().filter(p -> p.getId().contains(id)).forEach(o -> System.out.println(o.toString()));
    }
}
