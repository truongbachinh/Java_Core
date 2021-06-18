package PassByValueOrReference;

public class PassByReference {
    int data = 50;

    void change(PassByReference op) {
        op.data = op.data + 100;
    }

    public static void main(String args[]) {
        PassByReference op = new PassByReference();

        System.out.println("Trước khi thay đổi: " + op.data);
        op.change(op); // truyền đối tượng
        System.out.println("Sau khi thay đổi: " + op.data);
    }
}
