package bai8;

import java.util.ArrayList;
import java.util.List;

public class Manager8 {
    private List<Card> cards = new ArrayList<>();

    public void add(Card card) {
        this.cards.add(card);
    }

    public boolean delete(String id) {
        Card card = this.cards.stream().filter(o -> o.getId().equals(id)).findFirst().orElse(null);
        if (card == null) {
            return false;
        }
        this.cards.remove(card);
        return true;
    }

    public void showInfo() {
        cards.forEach(o -> System.out.println(o.toString()));
    }
}
