package Java_task_OOP.Triangle;


import Java_task_OOP.Point.MyPoint;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    public double getPerimetr() {
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }

    public String getType() {
        double delta = 0.0001d;
        double a = v1.distance(v2);
        double b = v1.distance(v3);
        double c = v2.distance(v3);
        if ((Math.abs(a - b) < delta) && (Math.abs(a - c) < delta)) {
            return "Equilateral";
        }
        if ((Math.abs(a - b) < delta) || (Math.abs(a - c) < delta) || (Math.abs(c - b) < delta)) {
            return "Isosceles";
        }
        return "Scalene";
    }
}
