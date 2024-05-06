public class DogTest {
    public static void main(String[] args) {

        Labrador labrador1 = new Labrador("Bidu", "black");
        System.out.println(labrador1.getName() + ", " + labrador1.avgBreedWeight() + " lbs, " + labrador1.getColor() +
                ", says " + labrador1.speak());

        Yorkshire yorkshire1 = new Yorkshire("Mia");
        System.out.println(yorkshire1.getName() + ", " + yorkshire1.avgBreedWeight() + " lbs, says " + yorkshire1.speak());
    }
}
