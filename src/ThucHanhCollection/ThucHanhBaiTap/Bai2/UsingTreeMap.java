package ThucHanhCollection.ThucHanhBaiTap.Bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class UsingTreeMap {

    public static void main(String[] args) throws ParseException {
        String date = "2020/05/12";
        Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(date);

        Date date2 = new Date(2020, 05, 17);
        Date date3 = new Date(2020, 05, 17);

        Order order1 = new Order(1, date1, "Cus01");
        Order order2 = new Order(2, date2, "Cus02");
        Order order3 = new Order(3, date3, "Cus03");

        OrderDetail orderDetail1 = new OrderDetail(1, 1, 1, 10, 10000);
        OrderDetail orderDetail2 = new OrderDetail(1, 2, 3, 5, 20000);
        OrderDetail orderDetail3 = new OrderDetail(2, 3, 2, 2, 20000);
        OrderDetail orderDetail4 = new OrderDetail(3, 4, 4, 10, 10000);

        Customer customer1 = new Customer(1, "Chinh", "Thanh hóa", "012-12");
        Customer customer2 = new Customer(2, "Linh", "Hà nội", "013-12");
        Customer customer3 = new Customer(3, "Chung", "Vĩnh phúc", "014-12");


        ArrayList<OrderDetail> arrayList1 = new ArrayList<>();
        arrayList1.add(orderDetail1);
        arrayList1.add(orderDetail2);
        ArrayList<OrderDetail> arrayList2 = new ArrayList<>();
        arrayList2.add(orderDetail3);
        ArrayList<OrderDetail> arrayList3 = new ArrayList<>();
        arrayList3.add(orderDetail4);

        ArrayList<Order> arrayList4 = new ArrayList<>();
        arrayList4.add(order1);
        ArrayList<Order> arrayList5 = new ArrayList<>();
        arrayList5.add(order2);
        ArrayList<Order> arrayList6 = new ArrayList<>();
        arrayList6.add(order3);


        // - Thực hành tìm kiếm danh sách hoá đơn theo mã khách hàng
        TreeMap<Customer, ArrayList<Order>> cusOrder = new TreeMap<>();
        cusOrder.put(customer1, arrayList4);
        cusOrder.put(customer2, arrayList5);
        cusOrder.put(customer3, arrayList6);


        for (Map.Entry<Customer, ArrayList<Order>> entry : cusOrder.entrySet()) {
            Customer key = entry.getKey();
            ArrayList<Order> value = entry.getValue();
            System.out.println(key + "  " + value);
        }
        System.out.println("-----------------------");

        System.out.println("total customer");
        System.out.println(cusOrder.size());
        System.out.println("Search order by cusID ");

        Customer newCus = new Customer(1, "Chinh", "Thanh hóa", "012-12");

        if (cusOrder.containsKey(newCus)) {

            ArrayList<Order> newOrder = cusOrder.get(newCus);
            System.out.println(newCus + " " + newOrder);
        } else {
            System.out.println("Not found!");
        }
        System.out.println("-----------------------");


        // - Thực hành tìm kiếm chi tiết hoá đơn theo mã hoá đơn
        TreeMap<Order, ArrayList<OrderDetail>> orderOrderDetail = new TreeMap<>();

        orderOrderDetail.put(order1, arrayList1);
        orderOrderDetail.put(order2, arrayList2);
        orderOrderDetail.put(order3, arrayList3);
        System.out.println("List orderdetail by order ");
        System.out.println("total order" + orderOrderDetail.size());
        for (Map.Entry<Order, ArrayList<OrderDetail>> order_search : orderOrderDetail.entrySet()) {
            Order key = order_search.getKey();
            ArrayList<OrderDetail> value = order_search.getValue();
            System.out.println(key + " " + value);
        }

        System.out.println("Search orderdetail by order ");

        Order newOrder = new Order(1, date1, "Cus01");


        if (orderOrderDetail.containsKey(newOrder)) {
            ArrayList<OrderDetail> newOderDetail = orderOrderDetail.get(newOrder);
            System.out.println(newOrder + " " + newOderDetail);
        } else {
            System.out.println("Not found");
        }
    }


}

