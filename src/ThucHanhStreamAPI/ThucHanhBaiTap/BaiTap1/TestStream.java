package ThucHanhStreamAPI.ThucHanhBaiTap.BaiTap1;

import ThucHanhCollection.ThucHanhSet.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Chinh", "Thanh Hóa");
        Customer customer2 = new Customer("Trinh", "Vĩnh phúc");
        Customer customer3 = new Customer("Chung", "Nghệ An");
        Customer customer4 = new Customer("An", "Thanh Hóa");
        Customer customer5 = new Customer("Linh", "Hà nội");
        Customer customer6 = new Customer("Tuấn", "Hà nội");
        Transaction transaction1 = new Transaction(customer1, 2020, "Vàng", 2);
        Transaction transaction2 = new Transaction(customer2, 2021, "Bạc", 3);
        Transaction transaction3 = new Transaction(customer3, 2021, "Kim cương", 5);
        Transaction transaction4 = new Transaction(customer4, 2021, "nhôm", 1);
        Transaction transaction5 = new Transaction(customer5, 2020, "đồng", 20);
        Transaction transaction6 = new Transaction(customer6, 2021, "sắt", 10);

        List<Transaction> transactionsList = new ArrayList<>();
        transactionsList.add(transaction1);
        transactionsList.add(transaction2);
        transactionsList.add(transaction3);
        transactionsList.add(transaction4);
        transactionsList.add(transaction5);
        transactionsList.add(transaction6);

        List<Transaction> transactions2021 = transactionsList.stream().filter(transaction -> transaction.getYear() == 2021)
                .collect(Collectors.toList());

        // cách stream 3.1
        System.out.println("Using stream api to find transaction ini 2021");
        transactions2021.stream().forEach(System.out::println);

        // 3.2 in ra địa chỉ trùng thì loại
        System.out.println("Using stream api to find district address");
        Collection<Customer> customers = Arrays.asList(customer1, customer2, customer3, customer4, customer5, customer6);
        List<String> address = customers.stream().map(Customer::getCity).distinct().collect(Collectors.toList());
        System.out.println(address);

        // 3.3
        // using Hash set để lọc phần tử trùng lặp và in ra tỉnh
        System.out.println("Using stream api to customer have same address");
        Set<String> allItems = new HashSet<>();
        Set<String> customer_address = customers.stream().map(Customer::getCity).filter(c -> !allItems.add(c)).collect(Collectors.toSet());

        System.out.println(customer_address);
        System.out.println("List 3.3");
        List<Customer> customerList = customers.stream().filter(customer -> allItems.add(customer.getCity())).sorted((c1, c2) -> c1.getName().compareTo(c2.getName())).collect(Collectors.toList());
        System.out.println(customerList);
        List<Customer> customerList2 = customers.stream().filter(customer -> allItems.add(customer.getCity())).sorted((c1, c2) -> c1.getName().compareTo(c2.getName())).collect(Collectors.toList());
        System.out.println(customerList);


        //3.4
        List<String> customerListName = customers.stream().map(customer -> customer.getName()).sorted((c1, c2) -> c1.compareTo(c2)).collect(Collectors.toList());
        System.out.println("List 3.4");
        System.out.println(customerListName);

        //3.5
        System.out.println("Set 3.5");
        Boolean check = customers.stream().anyMatch(v -> v.getCity().equalsIgnoreCase("Thanh hóa"));
        System.out.println(check);

        // 3.6 xac dinh amout lon nhat find max
        System.out.println("Amount maxx");
        Integer maxAmount = transactionsList.stream().mapToInt(v -> v.getAmount()).max().getAsInt();
        System.out.println(maxAmount);

        //3.7


        //3.8 amount nho nhat
        System.out.println("Amount min");
        Integer minAmount = transactionsList.stream().mapToInt(value -> value.getAmount()).min().getAsInt();
        System.out.println(minAmount);

    }
}
