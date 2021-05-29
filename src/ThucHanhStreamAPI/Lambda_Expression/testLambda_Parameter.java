package ThucHanhStreamAPI.Lambda_Expression;

@FunctionalInterface
interface Print {
    String print(String msg, String msg2);
}

@FunctionalInterface
interface Print2 {
    String print(String msg);
}

public class testLambda_Parameter {
    public static void main(String[] args) {
        //sử dụng dấu ngoặc đơn, khi có nhiều hơn 2 đối số
        Print S = (hoten, diachi) ->
        {
            return "Hoten: " + hoten + " Địa Chỉ " + diachi;
        };
        System.out.println(S.print("Chinh", "ThanhHoa"));

        Print2 s = hoten -> hoten;
        System.out.println(s.print("Linh"));

    }
}
