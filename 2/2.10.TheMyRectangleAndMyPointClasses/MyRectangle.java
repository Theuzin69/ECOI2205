public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }


    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public double getPerimeter() {
        double height = Math.abs(topLeft.getY()-bottomRight.getY());
        double length = Math.abs(topLeft.getX()-bottomRight.getX());
        return height*2+length*2;
    }

    public double getArea() {
        double height = Math.abs(topLeft.getY()-bottomRight.getY());
        double length = Math.abs(topLeft.getX()-bottomRight.getX());
        return Math.abs(height*length);
    }

    public void setTopLeft(int x, int y) {
        topLeft.setXY(x,y);
    }

    public void setBottomRight(int x, int y) {
        bottomRight.setXY(x,y);
    }

    public String toString() {
        return "MyRectangle[topLeft="+topLeft+
                ",bottomRight"+bottomRight+"]";
    }
}
