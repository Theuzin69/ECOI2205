public class TestMyTriangle {
    public static void main(String[] args ) {
        MyPoint triangle2vertice1 = new MyPoint(1,2);
        MyPoint triangle2vertice2 = new MyPoint(4,5);
        MyPoint triangle2vertice3 = new MyPoint(1,7);

        MyTriangle triangle1 = new MyTriangle(0,0,8,0,4,4);
        MyTriangle triangle2 = new MyTriangle(triangle2vertice1,triangle2vertice2,triangle2vertice3);

        System.out.println("Perimeter is: "+triangle2.getPerimeter());
        System.out.println("Type is: "+triangle2.getType());

        System.out.println("Perimeter is: "+triangle1.getPerimeter());
        System.out.println("Type is: "+triangle1.getType()+". It is impossible to have an equilateral triangle with only integer vertices!");
    }
}
