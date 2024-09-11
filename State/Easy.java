package State;

/**
 * Represents the easy level of the arithmetic game.
 * Provides basic functionality for number generation and difficulty management.
 * 
 * @author Alok Patel
 */
public class Easy implements State {
    private ArithmeticGame game;

    /**
     * Constructs the Easy state with a reference to the ArithmeticGame.
     * @param game The game instance this state is associated with.
     */
    public Easy(ArithmeticGame game) {
        this.game = game;
    }

    /**
     * Generates a random number within the easy level range (1 to 10).
     * @return Random number for the game question.
     */
    @Override
    public int getNum() {
        return (int) (Math.random() * 10) + 1;
    }

    /**
     * Randomly selects an operation from the available types.
     * @return Random operation for the game question.
     */
    @Override
    public Operation getOperation() {
        Operation[] operations = Operation.values();
        return operations[(int) (Math.random() * operations.length)];
    }

    /**
     * Upgrades the game difficulty to the medium level.
     */
    @Override
    public void increaseDifficulty() {
        game.setState(game.getMediumState());
    }

    /**
     * No difficulty decrease action needed for the easiest level.
     */
    @Override
    public void decreaseDifficulty() {
        // No action needed for the easiest level
    }
}
