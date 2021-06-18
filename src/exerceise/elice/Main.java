package exerceise.elice;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        Supplier supplier1 = new Supplier("S1", "An", "thanh hoa", "012-123-1234");
        Supplier supplier2 = new Supplier("S2", "Viet", "ha noi", "012-123-1235");
        Supplier supplier3 = new Supplier("S3", "Cuong", "vinh phuc", "012-123-1236");

        Item item1 = new Item(1, "Cá");
        Item item2 = new Item(2, "Mực");
        Item item3 = new Item(3, "Ghẹ");

        Date date1 = new Date(2021, 06, 01);
        Date date2 = new Date(2021, 06, 02);
        Date date3 = new Date(2021, 06, 03);
        Purchase purchase1 = new Purchase(1, date1, supplier1.getIdSup());
        Purchase purchase2 = new Purchase(2, date2, supplier2.getIdSup());
        Purchase purchase3 = new Purchase(3, date3, supplier3.getIdSup());
        Purchase purchase4 = new Purchase(4, date3, supplier1.getIdSup());

        PurchaseDetail purchaseDetail1 = new PurchaseDetail(purchase1.getIdPurchase(), 1, item1.getIdItem(), 52, 10.000);
        PurchaseDetail purchaseDetail2 = new PurchaseDetail(purchase2.getIdPurchase(), 2, item2.getIdItem(), 20, 11.000);
        PurchaseDetail purchaseDetail3 = new PurchaseDetail(purchase3.getIdPurchase(), 3, item3.getIdItem(), 10, 12.000);
        PurchaseDetail purchaseDetail4 = new PurchaseDetail(purchase4.getIdPurchase(), 4, item3.getIdItem(), 10, 12.000);


        Date date4 = new Date(2021, 06, 04);
        Date date5 = new Date(2021, 06, 05);
        Date date6 = new Date(2021, 06, 06);


        Customer customer1 = new Customer("C1", "chinh", "thanh hoa", "012-123-1231");
        Customer customer2 = new Customer("C2", "linh", "ha noi", "012-123-1232");
        Customer customer3 = new Customer("C3", "nam", "vinh phuc", "012-123-1233");

        //cus or
        Order order1 = new Order(1, date4, customer1.getId());
        Order order2 = new Order(2, date5, customer2.getId());
        Order order3 = new Order(3, date5, customer3.getId());
        Order order4 = new Order(4, date6, customer1.getId());

        OrderDetail orderDetail1 = new OrderDetail(1, order1.getIdOrder(), item1.getIdItem(), 1, 5.000);
        OrderDetail orderDetail2 = new OrderDetail(1, order2.getIdOrder(), item2.getIdItem(), 1, 5.500);
        OrderDetail orderDetail3 = new OrderDetail(1, order3.getIdOrder(), item3.getIdItem(), 1, 6.000);
        OrderDetail orderDetail4 = new OrderDetail(1, order4.getIdOrder(), item2.getIdItem(), 1, 5.500);

        Map<Order, OrderDetail> map1 = new TreeMap<>();
        map1.put(order1, orderDetail1);

        Map<Order, OrderDetail> map2 = new TreeMap<>();
        map2.put(order2, orderDetail2);

        Map<Order, OrderDetail> map3 = new TreeMap<>();
        map3.put(order3, orderDetail3);

        Map<Order, OrderDetail> map4 = new TreeMap<>();
        map4.put(order4, orderDetail4);

        ArrayList<Map<Order, OrderDetail>> list1 = new ArrayList<>();
        list1.add(map1);
        list1.add(map4);
        ArrayList<Map<Order, OrderDetail>> list2 = new ArrayList<>();
        list2.add(map2);
        ArrayList<Map<Order, OrderDetail>> list3 = new ArrayList<>();
        list3.add(map3);


        System.out.println(" Câu 1");
        Map<Customer, ArrayList<Map<Order, OrderDetail>>> customerOrderMap = new TreeMap<>();
        customerOrderMap.put(customer1, list1);
        customerOrderMap.put(customer2, list2);
        customerOrderMap.put(customer3, list3);
        System.out.println("In ra chi tiết người dùng và toàn bộ đơn hàng");
        for (Map.Entry<Customer, ArrayList<Map<Order, OrderDetail>>> entry : customerOrderMap.entrySet()) {
            Customer key = entry.getKey();
            ArrayList<Map<Order, OrderDetail>> o = entry.getValue();
            System.out.println("------------------------------------Customer----------------------------------------");
            System.out.println("Customer: " + key);
            System.out.println();
            for (Map<Order, OrderDetail> od : o) {
                for (Map.Entry<Order, OrderDetail> entryDetail : od.entrySet()) {
                    Order okey = entryDetail.getKey();
                    OrderDetail odValue = entryDetail.getValue();
                    System.out.println("Order: " + okey);
                    System.out.println("Order Detail: " + odValue);
                    System.out.println();
                }
            }

        }

        System.out.println();


        System.out.println();
        System.out.println("Câu 2");

        Map<Purchase, PurchaseDetail> map6 = new HashMap<>();
        map6.put(purchase1, purchaseDetail1);

        Map<Purchase, PurchaseDetail> map7 = new HashMap<>();
        map7.put(purchase2, purchaseDetail2);
        Map<Purchase, PurchaseDetail> map8 = new HashMap<>();
        map8.put(purchase3, purchaseDetail3);
        Map<Purchase, PurchaseDetail> map9 = new HashMap<>();
        map9.put(purchase4, purchaseDetail4);

        ArrayList<Map<Purchase, PurchaseDetail>> list5 = new ArrayList<>();
        list5.add(map6);
        list5.add(map9);
        ArrayList<Map<Purchase, PurchaseDetail>> list6 = new ArrayList<>();
        list6.add(map7);
        ArrayList<Map<Purchase, PurchaseDetail>> list7 = new ArrayList<>();
        list7.add(map8);


        Map<Supplier,ArrayList<Map<Purchase,PurchaseDetail>>> supplierPurchaseMap = new HashMap<>();
        supplierPurchaseMap.put(supplier1,list5);
        supplierPurchaseMap.put(supplier2,list6);
        supplierPurchaseMap.put(supplier3,list7);

        System.out.println("In ra chi tiết nhà cung cấp và toàn bộ đơn hàng");

        for (Map.Entry<Supplier,ArrayList<Map<Purchase,PurchaseDetail>>> listEntry: supplierPurchaseMap.entrySet()) {
                Supplier supplier = listEntry.getKey();
            System.out.println("------------------------------------Supplier----------------------------------------");
            System.out.println("Supplier: "  + supplier);
            ArrayList<Map<Purchase,PurchaseDetail>> arrayList = listEntry.getValue();
            for (Map<Purchase,PurchaseDetail> mapDetail: arrayList) {
                for (Map.Entry<Purchase,PurchaseDetail> detailEntry: mapDetail.entrySet()) {
                    Purchase okey = detailEntry.getKey();
                    PurchaseDetail odValue = detailEntry.getValue();
                    System.out.println("Purchase: " + okey);
                    System.out.println("Purchase Detail: " + odValue);
                    System.out.println();
                }
            }
        }
        System.out.println("------------------------------------End----------------------------------------");

        System.out.println("In ra hóa đơn của một khách hàng");
        // sử dụng collection
        ArrayList<Map<Order, OrderDetail>> listSearch = new ArrayList<>();
        listSearch.add(map1);
        listSearch.add(map2);
        listSearch.add(map3);
        listSearch.add(map4);
        System.out.println("Customer: " + customer1.getName());
        ArrayList<Map<Order, OrderDetail>> searchCustomer = (ArrayList<Map<Order, OrderDetail>>) listSearch.stream().filter(f -> f.containsKey(customer1)).collect(Collectors.toList());
        for (Map<Order, OrderDetail> m : searchCustomer) {
            for (Map.Entry<Order,OrderDetail> entry : m.entrySet()) {
                Order order =  entry.getKey();
                OrderDetail orderDetail = entry.getValue();
                System.out.println("Order: " + order);
                System.out.println("Order Detail: " + orderDetail);
            }

        }



    }


}

