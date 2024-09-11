package State;

/**
 * Defines the behavior for game states within an arithmetic game.
 * Each state is responsible for generating numbers, selecting operations,
 * and managing the game's difficulty level.
 * 
 * @author Alok Patel
 */
public interface State {
    
    /**
     * Generates a random number appropriate for the current game state's difficulty level.
     * @return A random number used in generating arithmetic questions.
     */
    int getNum();

    /**
     * Selects a random arithmetic operation (e.g., addition, subtraction, multiplication, division).
     * @return An operation used in arithmetic questions.
     */
    Operation getOperation();

    /**
     * Increases the game's difficulty level if applicable.
     */
    void increaseDifficulty();

    /**
     * Decreases the game's difficulty level if applicable.
     */
    void decreaseDifficulty();
}
