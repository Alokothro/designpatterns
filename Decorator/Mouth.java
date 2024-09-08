import java.util.ArrayList;

/**
 * This class is a decorator that adds a mouth to the character.
 * 
 * @author Alok Patel
 */
public class Mouth extends CharacterDecorator {

    /**
     * Constructor to add a mouth to the specified character by reading the
     * "mouth.txt" file and integrating it.
     * 
     * @param character The character to which the mouth will be added.
     */
    public Mouth(Character character) {
        super(character);
        ArrayList<String> mouth = FileReader.getLines("Decorator/mouth.txt");
        this.integrateDecor(mouth);
    }
}
