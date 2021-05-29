package ThucHanhStreamAPI.Lambda_Expression;

@FunctionalInterface
interface Drawable
{
    void draw();
}
public class test {
    public static void main(String[] args) {
        int width = 10;
        //implement using lambda
        Drawable dr = ()->{
            System.out.println("Drawing: " + width);
        };
        dr.draw();
    }
}
