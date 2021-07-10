package OOP_Relationship;

 class sPoint {
    private int x;
    private int y;

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

    public sPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Triangle{
    private Point vertice1;
    private Point vertice2;
    private Point vertice3;

    public Triangle(Point vertice1, Point vertice2, Point vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.vertice1  = new Point(x1,x2);
        this.vertice2 = new Point(x2,y2);
        this.vertice3 = new Point(x3,y3);
    }
    public double getPerimeter()
    {
        double b1 =  Math.sqrt(Math.pow(vertice1.getX()-vertice1.getY(),2));
        double b2 =  Math.sqrt(Math.pow(vertice2.getX()-vertice2.getY(),2));
        double b3  = Math.sqrt(Math.pow(vertice3.getX()-vertice3.getY(),2));
        return b1+b2+b3;
    }

}

class Line{
    // thuộc tính của lớp nầy là đối tượng của lớp khác
    Point begin;
    Point end;

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }
    public Line(int x1, int y1, int x2, int y2)
    {
        // component đối tượng của lớp point phụ thuộc vào hàm khởi tạo constructor lớp Line
        this.begin =  new Point(x1,y1);
        this.end = new Point(x2,y2);
    }
    public double getLength()
    {
        return Math.pow((begin.getX() - end.getX()),2)+ Math.pow(begin.getY()- end.getY(),2);
    }
}


class sEntry {
    public static void main(String[] args) {
        Point begin = new Point(1, 1);
        Point end = new Point(2, 2);
        Line line1 = new Line(begin, end);
        System.out.println(line1.getLength());

        Line line2 = new Line(2, 3, 5, 4);
        System.out.println(line2.getLength());
    }
}


