public class TestMyLine {
    public static void main(String[] args) {
        MyPoint begin1 = new MyPoint(3,5);
        MyPoint end1 = new MyPoint(6,10);
        MyLine line1 = new MyLine(begin1,end1);

        System.out.println(line1);
        line1.setEndXY(7,2);
        System.out.println("("+line1.getEndXY()[0]+","+line1.getEndXY()[1]+")");
        System.out.println(line1);
        System.out.println(line1.getLength());
        System.out.println(line1.getGradient());

    }
}
