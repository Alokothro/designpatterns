import java.util.ArrayList;

/**
 * This class is a decorator that adds a hat to the character.
 * 
 * @author Alok Patel
 */
public class Hat extends CharacterDecorator {

    /**
     * Constructor to add a hat to the specified character by reading the
     * "hat.txt" file and integrating it.
     * 
     * @param character The character to which the hat will be added.
     */
    public Hat(Character character) {
        super(character);
        FileReader fileReader = new FileReader();
        ArrayList<String> hat = fileReader.getLines("Decorator/hat.txt");
        this.integrateDecor(hat);
    }
}
