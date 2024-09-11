package State;

/**
 * Represents a mathematical question generated for an arithmetic game.
 * Handles arithmetic operations including addition, subtraction, multiplication, and division,
 * ensuring all division operations result in integer answers.
 * 
 * @author Alok Patel
 */
public class Question {
    private String question;
    private int answer;

    /**
     * Constructs a Question with the specified numbers and operation.
     * Automatically adjusts division questions to ensure integer results and prevents division by zero.
     *
     * @param num1 The first number in the operation.
     * @param num2 The second number in the operation.
     * @param operation The arithmetic operation to apply.
     */
    public Question(int num1, int num2, Operation operation) {
        switch (operation) {
            case PLUS:
                this.question = num1 + " + " + num2;
                this.answer = num1 + num2;
                break;
            case MINUS:
                this.question = num1 + " - " + num2;
                this.answer = num1 - num2;
                break;
            case MULTIPLY:
                this.question = num1 + " * " + num2;
                this.answer = num1 * num2;
                break;
            case DIVIDE:
                if (num2 != 0) {
                    num1 = num2 * ((int) (Math.random() * 10) + 1); // Ensures num1 is a multiple of num2
                    this.question = num1 + " / " + num2;
                    this.answer = num1 / num2; // This will now always be an integer
                } else {
                    this.question = "Divide by zero error";
                    this.answer = 0; // Placeholder for division by zero
                }
                break;
            default:
                this.question = "Invalid operation";
                this.answer = 0;
                break;
        }
    }

    /**
     * Returns the formatted question as a string.
     * @return The formatted arithmetic question.
     */
    public String toString() {
        return question;
    }

    /**
     * Returns the answer to the arithmetic question.
     * @return The integer answer.
     */
    public int getAnswer() {
        return answer;
    }

    /**
     * Checks if the provided answer matches the correct answer.
     * @param providedAnswer The answer to verify.
     * @return true if the provided answer is correct, false otherwise.
     */
    public boolean isCorrect(int providedAnswer) {
        return this.answer == providedAnswer;
    }
}
