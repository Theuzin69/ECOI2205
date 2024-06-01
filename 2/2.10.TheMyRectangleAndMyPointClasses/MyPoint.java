public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
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

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "("+x+","+y+")";
    }

    public double distance(int x, int y) {
        return Math.sqrt(((x-this.x)*(x-this.x))+
                ((y-this.y)*(y-this.y)));
    }

    public double distance(MyPoint another) {
        double Xdistance = another.x-this.x;
        double Ydistance = another.y-this.y;
        return Math.sqrt( Xdistance*Xdistance + Ydistance*Ydistance );
    }

    public double distance() {
        return Math.sqrt((this.x*this.x)+(this.y*this.y));
    }
}
