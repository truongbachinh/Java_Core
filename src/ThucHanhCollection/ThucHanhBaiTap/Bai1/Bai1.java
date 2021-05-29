package ThucHanhCollection.ThucHanhBaiTap.Bai1;

import ThucHanhCollection.ThucHanhSet.Student;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Bai1 {
    public static void main(String[] args) {
        Map<Depositors, Double> depositor = new TreeMap<>();
        double defaul = 100.000;
        depositor.put(new Depositors(1, "Chinh", "ThanhHoa", "0923456789", "20-05-1998"), defaul);
        depositor.put(new Depositors(2, "Linh", "ThanhHoa", "0823456789", "20-05-1997"), defaul);
        depositor.put(new Depositors(3, "Chung", "ThanhHoa", "0723456789", "20-05-1996"), defaul);
        depositor.put(new Depositors(4, "Trinh", "ThanhHoa", "0623456789", "20-05-1995"), defaul);
        depositor.put(new Depositors(5, "Minh", "ThanhHoa", "0523456789", "20-05-1994"), defaul);

        System.out.println("Check 1");

        Depositors newDT1 = new Depositors(1, "Chinh", "ThanhHoa", "0923456789", "20-05-1998");
        System.out.println();
        if (depositor.containsKey(newDT1)) {
            depositor.replace(newDT1, depositor.get(newDT1) + 100.000);
        } else {
            depositor.put(newDT1, 100.000);
        }
        for (Depositors key : depositor.keySet()) {
            System.out.println(key + " , " + depositor.get(key));
        }
    }
}
