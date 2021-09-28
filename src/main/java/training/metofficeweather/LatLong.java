package training.metofficeweather;

public class LatLong {
    private int x;
    private int y;

    public LatLong(int initx, int inity){
        x = initx;
        y = inity;
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
        return "LatLong{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
