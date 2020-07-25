import java.util.Comparator;

class PriorityComparator implements Comparator<Wish> {
    int directSort;

    public PriorityComparator(int directSort) {
        this.directSort = directSort;
    }

    public int compare(Wish w1, Wish w2) {
        int output;
        if (w1.getPriorityWish() == w2.getPriorityWish()) {
            output = 0;
        } else if (w1.getPriorityWish() < w2.getPriorityWish()) {
            output = 1 * directSort;
        } else {
            output = -1 * directSort;
        }
        return output;
    }
}