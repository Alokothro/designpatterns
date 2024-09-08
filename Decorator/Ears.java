import java.util.ArrayList;

/**
 * This class is a decorator that adds ears to the character.
 *  
 * @author Alok Patel
 */
public class Ears extends CharacterDecorator {

    /**
     * Constructor to add ears to the specified character by reading the
     * "ears.txt" file and integrating it.
     * 
     * @param character The character to which the ears will be added.
     */
    public Ears(Character character) {
        super(character);
        FileReader fileReader = new FileReader();
        ArrayList<String> ears = fileReader.getLines("Decorator/ears.txt");
        this.integrateDecor(ears);
    }
}
