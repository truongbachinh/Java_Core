package exerceise.elice;

public class Item {
    private int idItem;// mã sản phẩm
    private String name;

    public Item(int idItem, String name) {
        this.idItem = idItem;
        this.name = name;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "idItem=" + idItem +
                ", name='" + name + '\'' +
                '}';
    }
}
