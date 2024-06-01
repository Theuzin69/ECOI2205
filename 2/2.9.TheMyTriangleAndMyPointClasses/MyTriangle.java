public class MyTriangle {
    private MyPoint vertice1;
    private MyPoint vertice2;
    private MyPoint vertice3;

    public MyTriangle(int x1, int y1, int x2, int y2,
                      int x3, int y3) {
        vertice1 = new MyPoint(x1, y1);
        vertice2 = new MyPoint(x2, y2);
        vertice3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint vertice1, MyPoint vertice2,
                      MyPoint vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    public String toString() {
        return "MyTriangle[vertice1="+vertice1+
                ",vertice2="+vertice2+
                ",vertice3="+vertice3+"]";
    }

    public double getPerimeter() {
        return vertice1.distance(vertice2)+
                vertice2.distance(vertice3)+
                vertice3.distance(vertice1);
    }

    public String getType() {
        double edge1 = vertice1.distance(vertice2) ;
        double edge2 = vertice2.distance(vertice3);
        double edge3 = vertice3.distance(vertice1);

        if(edge1==edge2 && edge2==edge3 && edge3==edge1) {
            return "Equilateral";
        } else if(edge1==edge2 || edge2==edge3 || edge3==edge1) {
            return "Isosceles";
        } else return "Scalene";
    }
}
