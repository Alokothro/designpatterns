import java.util.*;

/**
 * Used to add/integrate new additions to the specified character
 * @author Alok Patel
 */
public abstract class CharacterDecorator extends Character {

    // The character you are decorating
    private Character character;

    /**
     * Initializes the character you are decorating
     * @param character The character you want to decorate
     */
    public CharacterDecorator(Character character) {
        super(character.lines, character.getName());
        this.character = character;
    }

    /**
     * Goes through every character and integrates the new decoration onto the original character
     * @param decor The ArrayList that holds the decoration you want to add/integrate onto the character
     */
    protected void integrateDecor(ArrayList<String> decor) {
        for (int i = 0; i < lines.size(); i++) {
            String line = "";

            for (int j = 0; j < Math.max(decor.get(i).length(), lines.get(i).length()); j++) {

                if (j >= lines.get(i).length()) {
                    line += decor.get(i).charAt(j);
                } else if (j >= decor.get(i).length()) {
                    line += lines.get(i).charAt(j);
                } else if (decor.get(i).charAt(j) == ' ') {
                    line += lines.get(i).charAt(j);
                } else if (lines.get(i).charAt(j) == ' ') {
                    line += decor.get(i).charAt(j);
                }
            }

            lines.set(i, line);
        }
    }
}
