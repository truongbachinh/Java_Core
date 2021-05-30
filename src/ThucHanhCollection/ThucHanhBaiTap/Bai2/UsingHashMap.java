package ThucHanhCollection.ThucHanhBaiTap.Bai2;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TreeMap;

public class UsingHashMap {

    public static void main(String[] args) {
        Date date1 = new Date(2021, 05, 12);
        Date date2 = new Date(2021, 05, 12);
        Date date3 = new Date(2021, 05, 12);

        Purchase purchase1 = new Purchase(1, date1, "P01");
        Purchase purchase2 = new Purchase(2, date2, "P02");
        Purchase purchase3 = new Purchase(3, date3, "P03");

        PurchaseDetail purchaseDetail1 = new PurchaseDetail(1, 1, 2, 3, 11000);
        PurchaseDetail purchaseDetail2 = new PurchaseDetail(1, 2, 1, 3, 13000);
        PurchaseDetail purchaseDetail3 = new PurchaseDetail(2, 3, 3, 3, 20000);
        PurchaseDetail purchaseDetail4 = new PurchaseDetail(3, 4, 4, 13, 100000);

        ArrayList<PurchaseDetail> purchaseDetails1 = new ArrayList<>();
        purchaseDetails1.add(purchaseDetail1);
        purchaseDetails1.add(purchaseDetail2);
        ArrayList<PurchaseDetail> purchaseDetails2 = new ArrayList<>();
        purchaseDetails2.add(purchaseDetail3);
        ArrayList<PurchaseDetail> purchaseDetails3 = new ArrayList<>();
        purchaseDetails3.add(purchaseDetail4);
        TreeMap<Purchase, ArrayList<PurchaseDetail>> purchaseArrayListTreeMap1 = new TreeMap<>();
        purchaseArrayListTreeMap1.put(purchase1, purchaseDetails1);
        TreeMap<Purchase, ArrayList<PurchaseDetail>> purchaseArrayListTreeMap2 = new TreeMap<>();
        purchaseArrayListTreeMap2.put(purchase2, purchaseDetails2);
        TreeMap<Purchase, ArrayList<PurchaseDetail>> purchaseArrayListTreeMap3 = new TreeMap<>();
        purchaseArrayListTreeMap3.put(purchase3, purchaseDetails3);

        Supplier supplier1 = new Supplier("S1", "Chinh", "Thanh Hóa");
        Supplier supplier2 = new Supplier("S2", "Linh", "Vĩnh phúc");
        Supplier supplier3 = new Supplier("S3", "Chung", "Hà nội");

        HashMap<Supplier, TreeMap<Purchase, ArrayList<PurchaseDetail>>> supplierTreeMapHashMap = new HashMap<>();
        supplierTreeMapHashMap.put(supplier1, purchaseArrayListTreeMap1);
        supplierTreeMapHashMap.put(supplier2, purchaseArrayListTreeMap2);
        supplierTreeMapHashMap.put(supplier3, purchaseArrayListTreeMap3);

        Supplier newSupplier = new Supplier("S1", "Chinh", "Thanh Hóa");
        if (supplierTreeMapHashMap.containsKey(newSupplier)) {
            TreeMap<Purchase, ArrayList<PurchaseDetail>> treeMap = supplierTreeMapHashMap.get(newSupplier);
            System.out.println(newSupplier + "\n " + treeMap);
        } else {
            System.out.println("Not found!");
        }

    }
}
