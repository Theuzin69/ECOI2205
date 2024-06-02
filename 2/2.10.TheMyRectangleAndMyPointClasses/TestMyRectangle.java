public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint();
        MyPoint bottomRight = new MyPoint(7,-3);
        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        System.out.println(rectangle);
        System.out.println("Perimeter is: "+rectangle.getPerimeter());
        System.out.println("Area is: "+rectangle.getArea());
        System.out.println("Top Left: "+rectangle.getTopLeft());
        System.out.println("Bottom Right: "+rectangle.getBottomRight());

        rectangle.setTopLeft(4,5);
        rectangle.setBottomRight(5,0);
        System.out.println(rectangle);
        System.out.println("Perimeter is: "+rectangle.getPerimeter());
        System.out.println("Area is: "+rectangle.getArea());
        System.out.println("Top Left: "+rectangle.getTopLeft());
        System.out.println("Bottom Right: "+rectangle.getBottomRight());
    }
}
