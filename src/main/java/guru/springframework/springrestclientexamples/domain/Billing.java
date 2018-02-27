package guru.springframework.springrestclientexamples.domain;

import java.io.Serializable;

public class Billing implements Serializable {

    private static final long serialVersionUID = 545063888139575493L;
    private Card card;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
