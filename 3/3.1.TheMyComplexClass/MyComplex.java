public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return "("+real+"+"+imag+"i"+")";
    }

    public boolean isReal() {
        return (imag == 0);
    }

    public boolean isImaginary() {
        return (real == 0);
    }

    public boolean equals(double real, double imag) {
        return (this.real==real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.real &&
                this.imag == another.imag);
    }

    public double magnitude() {
        return (Math.sqrt((this.real*this.real)+(this.imag*this.imag)));
    }

    public double argument() {
        return (Math.atan2(this.imag , this.real));
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex newMyComplex = new MyComplex(this.real,this.imag);
        return newMyComplex.add(right);
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        MyComplex newMyComplex = new MyComplex(this.real,this.imag);
        return newMyComplex.subtract(right);
    }

    public MyComplex multiply(MyComplex right) {
        this.real = (this.real * right.real) - (this.imag * right.imag);
        this.imag = (this.real * right.imag) + (this.imag * right.real);
        return this;
    }

    public MyComplex divide(MyComplex right) {
        this.real = ((this.real * right.real) + (this.imag * right.imag))
                / ((right.real* right.real) + (right.imag * right.imag));
        this.imag = (this.imag * right.real) - (this.real * right.imag)
                / ((right.real* right.real) + (right.imag * right.imag));
        return this;
    }

    public MyComplex conjugate() {
        this.imag *= -1;
        return this;
    }
}
