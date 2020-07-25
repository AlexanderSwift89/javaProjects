public class Product implements Comparable {
    private String name;
    private int price;
    private String description;

    public Product(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Product() {
    }

    public void initProduct(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void showProduct() {
        System.out.println(this.name + "                   " + this.price + "                    " + this.description);
    }

    public int getPrice() {
        return price;
    }

    public int compareTo(Object obj) {
        Product tmp = (Product) obj;
        if (this.price < tmp.price) {
            /* текущее меньше полученного */
            return -1;
        } else if (this.price > tmp.price) {
            /* текущее больше полученного */
            return 1;
        }
        /* текущее равно полученному */
        return 0;
    }
}