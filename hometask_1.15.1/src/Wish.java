public class Wish {
    String nameWish;
    String describeWish;
    double priceWish;
    String urlShopWish;
    int priorityWish;

    public Wish() {
        //конструктор по умолчанию
    }

    public Wish(String nameWish, String describeWish, double priceWish, String urlShopWish, int priorityWish) {
        this.nameWish = nameWish;
        this.describeWish = describeWish;
        this.priceWish = priceWish;
        this.urlShopWish = urlShopWish;
        this.priorityWish = priorityWish;
    }

    public String getNameWish() {
        return nameWish;
    }

    public String getDescribeWish() {
        return describeWish;
    }

    public double getPriceWish() {
        return priceWish;
    }

    public String getUrlShopWish() {
        return urlShopWish;
    }

    public int getPriorityWish() {
        return priorityWish;
    }
}