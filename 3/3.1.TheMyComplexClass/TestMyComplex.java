public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex number1 = new MyComplex();
        MyComplex number2 = new MyComplex(2.0,3.1);

        System.out.println("getters/setters");
        System.out.println(number1.getReal());
        number1.setReal(4.5);
        System.out.println(number1.getReal());

        System.out.println(number1.getImag());
        number1.setImag(6.2);
        System.out.println(number1.getImag());

        number2.setValue(2.8,3.9);
        System.out.println(number2);

        System.out.println("\nis");
        System.out.println(number1.isReal());
        System.out.println(number2.isReal());
        System.out.println(number1.isImaginary());
        System.out.println(number2.isImaginary());

        MyComplex number3 = new MyComplex(0.0,0.0);
        System.out.println(number3.isReal());
        System.out.println(number3.isImaginary());

        System.out.println("\nequals");
        System.out.println(number1.equals(10.9,10.1));
        System.out.println(number1.equals(4.5,6.2));
        System.out.println(number1.equals(number2));
        System.out.println(number1.equals(number1));

        System.out.println("\nmagnitude");
        System.out.println(number1.magnitude());

        System.out.println("\nadd");
        System.out.println(number1.add(number2));
        System.out.println(number1.addNew(number2));

        System.out.println("\nargument");
        System.out.println(number1 + " argument: " + number1.argument());
    }
}
