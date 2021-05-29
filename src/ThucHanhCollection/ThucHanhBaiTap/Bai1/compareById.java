package ThucHanhCollection.ThucHanhBaiTap.Bai1;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class compareById implements Comparator<Depositors> {
    @Override
    public int compare(Depositors o1, Depositors o2) {
        return o1.getId() - o2.getId();
    }


}
