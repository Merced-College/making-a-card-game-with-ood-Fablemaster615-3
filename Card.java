
public class Card {
    private String suit;
    private int value;
    private String rank;

    public Card(){
        this.value = 0;
        this.suit = "no suit";
        this.rank = "no rank";
    }

    public Card(int value, String suit, String rank){
        this.value = value;
        this.suit = suit;
        this.rank = rank;
    }

    public String getRank(){
        return rank;
    }
    public String getSuit(){
        return suit;
    }
    public int getValue(){
        return value;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    public void setValue(int value){
        this.value = value;
    }

    public void setSuit(String suit){
        this.suit = suit;
    }

    public String toString(){
        return rank + " of " + suit + " with a value of " + value + ".";
    }

}
