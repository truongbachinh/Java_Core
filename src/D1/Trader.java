package D1;

import java.util.HashMap;
import java.util.Map;

public class Trader implements Comparable<Trader> {
    private String Id; // mã trader
    private String Name;
    private String Address;
    private String Tel;
    private double Money;
    private Map<Stock, Integer> Listed_stock = new HashMap<>();

    public Trader() {
    }

    public Trader(String Id, String Name, String Address, String Tel, double Money) {
        this.Id = Id;
        this.Name = Name;
        this.Address = Address;
        this.Tel = Tel;
        this.Money = Money;
    }

    public Trader(String Id, String Name, String Address, String Tel, double Money, Map<Stock, Integer> Listed_stock) {
        this.Id = Id;
        this.Name = Name;
        this.Address = Address;
        this.Tel = Tel;
        this.Money = Money;
        this.Listed_stock = Listed_stock;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getId() {
        return this.Id;
    }

    public String getName() {
        return this.Name;
    }

    public void setMoney(double Money) {
        this.Money = Money;
    }

    public double getMoney() {
        return this.Money;
    }

    public void setStockAmount(Stock Stock, int Amount) {
        this.Listed_stock.put(Stock, Amount);
    }

    public int getStockAmount(Stock Sto) {
        if (this.Listed_stock.get(Sto) == null) {
            return 0;
        }
        return this.Listed_stock.get(Sto);
    }

    public int compareTo(Trader Trader) {
        return this.Id.compareTo(Trader.Id);
    }

    public String toString() {
        Listed_stock.entrySet().stream()
                .forEach(sto -> System.out.println(sto.getKey().getId() + "= " + sto.getValue()));
        return Id + ": " + Name + ": " + Money;
    }
}
