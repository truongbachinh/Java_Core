package PassByValueOrReference;

public class PassbyValue {

    int data = 50;

    void change(int data) {
       data = data + 100;
    }
    int change(int data,int value)
    {
        data = data+value+100;
        return data;
    }

    public static void main(String args[]) {
        PassbyValue op = new PassbyValue();

        System.out.println("Trước khi thay đổi: " + op.data);

        op.change(op.data);

        System.out.println("Sau khi thay đổi: " + op.data);
    }

}
