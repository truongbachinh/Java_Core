package ThucHanhStreamAPI.Lambda_Expression;

@FunctionalInterface
interface Drawable {
    void draw(String s
    );
}

public class test {
    public static void main(String[] args) {
        String width = "1";
        //implement using lambda
        Drawable dr = (s) -> {
            System.out.println("Drawing: " + s);
        };
        dr.draw(width);
    }
}
