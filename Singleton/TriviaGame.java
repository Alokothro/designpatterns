import java.util.ArrayList;
import java.util.Random;

/**
 * Singleton TriviaGame class to manage game logic.
 * 
 * @author Alok Patel
 */
public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private int numGames;
    private Random rand;
    private ArrayList<Question> questions;

    // Private constructor for singleton pattern
    private TriviaGame() {
        score = 0;
        numGames = 0;
        rand = new Random();
        questions = DataLoader.getTriviaQuestions();
    }

    /**
     * Get the single instance of TriviaGame.
     */
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    /**
     * Get a random question from the list.
     */
    public Question getQuestion() {
        if (!questions.isEmpty()) {
            return questions.remove(rand.nextInt(questions.size()));
        }
        return null;
    }

    /**
     * Check if there are more questions.
     */
    public boolean hasMoreQuestions() {
        return !questions.isEmpty();
    }

    /**
     * Increment score for a win.
     */
    public void winRound() {
        score++;
        numGames++;
    }

    /**
     * Increment numGames for a loss.
     */
    public void loseRound() {
        numGames++;
    }

    /**
     * Get the current score as a string.
     */
    public String getScores() {
        return "You scored " + score + "/" + numGames;
    }
}
