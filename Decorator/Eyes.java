import java.util.ArrayList;

/**
 * This class is a decorator that adds eyes to the character.
 * 
 * @author Alok Patel
 */
public class Eyes extends CharacterDecorator {

    /**
     * Constructor to add eyes to the specified character by reading the
     * "eyes.txt" file and integrating it.
     * 
     * @param character The character to which the eyes will be added.
     */
    public Eyes(Character character) {
        super(character);
        FileReader fileReader = new FileReader();
        ArrayList<String> eyes = fileReader.getLines("Decorator/eyes.txt");
        this.integrateDecor(eyes);
    }
}
