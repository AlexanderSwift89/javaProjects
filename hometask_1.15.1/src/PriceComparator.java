import java.util.Comparator;

class PriceComparator implements Comparator<Wish> {
    int directSort;

    public PriceComparator(int directSort) {
        this.directSort = directSort;
    }

    public int compare(Wish w1, Wish w2) {
        int output;
        if (w1.getPriceWish() == w2.getPriceWish()) {
            output = 0;
        } else if (w1.getPriceWish() < w2.getPriceWish()) {
            output = 1 * directSort;
        } else {
            output = -1 * directSort;
        }
        return output;
    }
}