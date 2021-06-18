package A_Toy_Stock_Exchange;

import java.util.Comparator;

public class descPrice implements Comparator<TraderOrder> {
    @Override
    public int compare(TraderOrder o1, TraderOrder o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}
