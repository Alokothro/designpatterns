package State;

/**
 * Represents the medium level of the arithmetic game.
 * Facilitates moderate difficulty for number generation and operation selection, 
 * and manages transitions between easier and harder game states.
 * 
 * @author Alok Patel
 */
public class Medium implements State {
    private ArithmeticGame game;

    /**
     * Constructs the Medium state with a reference to the ArithmeticGame.
     * @param game The game instance this state is associated with.
     */
    public Medium(ArithmeticGame game) {
        this.game = game;
    }

    /**
     * Generates a random number within the medium level range (10 to 50).
     * @return Random number for the game question.
     */
    @Override
    public int getNum() {
        return (int) (Math.random() * 40) + 10;
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
     * Increases the game difficulty to the hard level.
     */
    @Override
    public void increaseDifficulty() {
        game.setState(game.getHardState());
    }

    /**
     * Decreases the game difficulty to the easy level.
     */
    @Override
    public void decreaseDifficulty() {
        game.setState(game.getEasyState());
    }
}
