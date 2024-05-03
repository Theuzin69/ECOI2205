public class Main {
    public static void main(String[] args) {

        Labrador labrador1 = new Labrador("Bidu", "Black");
        System.out.println(labrador1.getName() + ", " + labrador1.avgBreedWeight() + " lbs, says " + labrador1.speak());

        Yorkshire yorkshire1 = new Yorkshire("Mia");
        System.out.println(yorkshire1.getName() + ", " + yorkshire1.avgBreedWeight() + " lbs, says " + yorkshire1.speak());
    }
}
