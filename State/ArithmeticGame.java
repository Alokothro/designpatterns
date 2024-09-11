package State;

/**
 * Manages an arithmetic game with various difficulty levels.
 * Automatically adjusts difficulty based on player's performance.
 * 
 * @author Alok Patel
 */
public class ArithmeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private int correctCount;   // Tracks correct answers
    private int incorrectCount; // Tracks incorrect answers

    /**
     * Initializes the game in easy mode.
     */
    public ArithmeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        state = easyState;  // Default start state
        score = 0;
        correctCount = 0;
        incorrectCount = 0;
    }

    /**
     * Generates a new question based on the current state.
     * @return Question based on difficulty
     */
    public Question getQuestion() {
        int num1 = state.getNum();
        int num2 = state.getNum();
        Operation op = state.getOperation();
        return new Question(num1, num2, op);
    }

    /**
     * Increases score and checks for difficulty adjustment.
     */
    public void increaseScore() {
        score++;
        correctCount++;
        incorrectCount = 0;
        checkDifficultyChange();
    }

    /**
     * Decreases score and checks for difficulty adjustment.
     */
    public void decreaseScore() {
        score--;
        incorrectCount++;
        correctCount = 0;
        checkDifficultyChange();
    }

    /**
     * Adjusts game difficulty based on player's answers.
     */
    private void checkDifficultyChange() {
        if (correctCount >= 3) {
            if (state instanceof Easy) {
                setState(mediumState);
            } else if (state instanceof Medium) {
                setState(hardState);
            }
            correctCount = 0;
        }
        if (incorrectCount >= 2) {
            if (state instanceof Hard) {
                setState(mediumState);
            } else if (state instanceof Medium) {
                setState(easyState);
            }
            incorrectCount = 0;
        }
    }

    /**
     * Updates the game's current state.
     * @param newState New state to set
     */
    public void setState(State newState) {
        this.state = newState;
        System.out.println("Level changed to: " + newState.getClass().getSimpleName());
    }

    // Getters for each game state
    public State getEasyState() { return easyState; }
    public State getMediumState() { return mediumState; }
    public State getHardState() { return hardState; }
}
