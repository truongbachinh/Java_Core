package A_Toy_Stock_Exchange;

import java.util.Comparator;

public class ascPrice implements Comparator<TraderOrder> {
    @Override
    public int compare(TraderOrder o1, TraderOrder o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
