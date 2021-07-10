package OOP_Relationship;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points ;

    public PolyLine() {
        this.points = new ArrayList<>();
    }

    public PolyLine(List<Point> points) {
        this.points = new ArrayList<>();
        this.points = points;
    }

    public void appendPoint(Point point) {

        this.points.add(point);
    }

    public void appendPoint(int x, int y) {
        Point point = new Point(x,y);
        this.points.add(point);
    }

    public double getLength() {
        double d1 = 0;
        for (Point p : points) {

            d1 +=  Math.sqrt(Math.pow(p.getX()-p.getY(),2));
        }

        return d1;
    }

}

class Entry {
    public static void main(String[] args) {
        PolyLine polyLine = new PolyLine();
        polyLine.appendPoint(new Point(1, 1));
        polyLine.appendPoint(new Point(2, 3));
        polyLine.appendPoint(3, 0);
        polyLine.appendPoint(4, 2);
        System.out.println(polyLine.getLength());
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return
                "x=" + x +
                        ", y=" + y
                ;
    }
}
