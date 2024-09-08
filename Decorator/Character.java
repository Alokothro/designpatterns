import java.util.ArrayList;

/**
 * This class represents a character with a name and a list of strings that represent
 * 
 * @author Alok Patel
 */
public class Character {
    
    // The name of the character
    protected String name;
    
    // The list of lines representing the character's ASCII art
    protected ArrayList<String> lines;

    /**
     * Constructor to initialize the character with its name and ASCII art lines.
     * 
     * @param lines The ArrayList of strings representing the character's ASCII art.
     * @param name The name of the character.
     */
    public Character(ArrayList<String> lines, String name) {
        this.lines = lines;
        this.name = name;
    }

    /**
     * Gets the name of the character.
     * 
     * @return The name of the character.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a string representation of the character, with each line of the ASCII art
     * appended into one single string with line breaks.
     * 
     * @return The string representation of the character.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }
}
