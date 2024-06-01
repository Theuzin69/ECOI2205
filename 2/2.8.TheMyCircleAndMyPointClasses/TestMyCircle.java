public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle();
        MyCircle circle2 = new MyCircle(2,3,5);

        MyPoint circle3center = new MyPoint(5,6);
        MyCircle circle3 = new MyCircle(circle3center, 2);

        System.out.println(circle3.distance(circle1));
        System.out.println(circle3.distance(circle2));

        System.out.println(circle3.getCircumference());
        System.out.println(circle3.getArea());
        System.out.println(circle3);

        circle3.setRadius(6);
        System.out.println(circle3.getCircumference());
        System.out.println(circle3.getArea());
        System.out.println(circle3);
    }
}
