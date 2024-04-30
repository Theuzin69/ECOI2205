public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Spike");
        System.out.println(dog1.getName() + " says " + dog1.speak());

        Labrador labrador1 = new Labrador("Bidu", "Black");
        System.out.println(labrador1.getName() + " says " + labrador1.speak());

        Yorkshire yorkshire1 = new Yorkshire("Mia");
        System.out.println(yorkshire1.getName() + " says " + yorkshire1.speak());
    }
}
