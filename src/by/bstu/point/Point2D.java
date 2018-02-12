package by.bstu.point;

public class Point2D extends Point1D{
    private int y;
    public Point2D (int x, int y){
        super(x);
        this.y = y;
    }
    @Override
    public double length(){
        return Math.hypot(super.length(), y);
    }
    @Override
    public String toString() {
        return super.toString() + " y=" + y;
    }
}
