package animalshelter;

/**
 * Created by Niklas on 2016-02-07.
 */
public class ShelterError {

    public static void main(String[] args){
        AnimalShelter<Cat> catShelter = new AnimalShelter<>(); //make animalshelter generic, no need for specific "shelter" for each class
        Dog badBoyRex = new Dog();

        catShelter.putAnimal(badBoyRex);
        System.out.println("Who let the dogs out?!?");
    }
}
