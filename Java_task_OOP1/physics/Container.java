package Java_task_OOP1.physics;

public class Container {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x1 + width;
        this.y2 = y1 + height;
    }


    public boolean collidesWidth(Ball ball) {
        if (ball.getX() + ball.getRadius() <= x2 && ball.getX() - ball.getRadius() >= x1) {
            if (ball.getY() + ball.getRadius() <= y2 && ball.getY() - ball.getRadius() >= y1) {
                return true;
            }
        }
        return false;
    }
}
