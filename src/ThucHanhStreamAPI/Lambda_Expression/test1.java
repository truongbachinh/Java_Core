package ThucHanhStreamAPI.Lambda_Expression;

interface Drawables {
    void draw();
}

public class test1 {
    public static void main(String[] args) {
        int w = 10;
        // implement using anonymous class
        Drawables dr = new Drawables() {
            public void draw() {
                System.out.println("Draw" + w);
            }
        };
        dr.draw();
    }
}
