import java.util.ArrayList;
import java.util.Arrays;

/**
 * Represents a trivia question with multiple answers.
 * 
 * @author Alok Patel
 */
public class Question {
    private String question;
    private ArrayList<String> answers;
    private int correctAnswer;

    /**
     * Constructor to create a Question.
     * 
     * @param question The question text.
     * @param correctAnswer The index of the correct answer (0-based).
     * @param answers The possible answers.
     */
    public Question(String question, int correctAnswer, String... answers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = new ArrayList<>(Arrays.asList(answers));
    }

    /**
     * Displays the question and possible answers.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(question + "\n");
        for (int i = 0; i < answers.size(); i++) {
            sb.append(i + 1).append(". ").append(answers.get(i)).append("\n");
        }
        return sb.toString();
    }

    /**
     * Checks if the provided answer is correct.
     * 
     * @param userAnswer The user's answer (1-based index).
     * @return True if the answer is correct, false otherwise.
     */
    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctAnswer + 1;
    }

    /**
     * Returns the correct answer as a string.
     */
    public String getCorrectAnswer() {
        return answers.get(correctAnswer);
    }
}
