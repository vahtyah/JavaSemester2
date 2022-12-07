import static java.lang.System.out;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("People",200);
        Book b2 = new Book("Nature");
        Book b3 = new Book();
        b3.setPrice(400);
        out.println(b1);
        b1.profit(3);
        b2.profit(9);
        b3.profit(10);
    }
}

class Book{
    private String topic;
    private int price;

    public Book(String topic, int price){
        this.topic = topic;
        this.price = price;
    }
    public Book(String topic){
        this(topic,100);
    }
    public Book(){
        this("Family",100);
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public String getTopic() {
        return this.topic;
    }

    @Override
    public String toString() {
        return "Book{" +
                "topic='" + topic + '\'' +
                ", price=" + price +
                '}';
    }

    public void profit(int amount){
        out.println("Profit: " + (this.price * amount));
    }
}
