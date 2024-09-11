package State;

/**
 * Represents the hard level of the arithmetic game.
 * Handles the generation of higher difficulty numbers and operations, and manages difficulty transitions.
 * 
 * @author Alok Patel
 */
public class Hard implements State {
    private ArithmeticGame game;

    /**
     * Constructs the Hard state with a reference to the ArithmeticGame.
     * @param game The game instance this state is associated with.
     */
    public Hard(ArithmeticGame game) {
        this.game = game;
    }

    /**
     * Generates a random number within the hard level range (50 to 100).
     * @return Random number for the game question.
     */
    @Override
    public int getNum() {
        return (int) (Math.random() * 50) + 50;
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
     * Hard level has no further increase in difficulty; this method does nothing.
     */
    @Override
    public void increaseDifficulty() {
        // No further difficulty beyond hard
    }

    /**
     * Decreases the game difficulty to the medium level.
     */
    @Override
    public void decreaseDifficulty() {
        game.setState(game.getMediumState());
    }
}
