import java.util.ArrayList;

/**
 * This class is a decorator that adds a nose to the character.
 * 
 * @author Alok Patel
 */
public class Nose extends CharacterDecorator {

    /**
     * Constructor to add a nose to the specified character by reading the
     * "nose.txt" file and integrating it.
     * 
     * @param character The character to which the nose will be added.
     */
    public Nose(Character character) {
        super(character);
        FileReader fileReader = new FileReader();
        ArrayList<String> nose = fileReader.getLines("Decorator/nose.txt");
        this.integrateDecor(nose);
    }
}
