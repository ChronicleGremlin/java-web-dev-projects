package studio;

public class Checkbox extends Question{

    public Checkbox(String question, String answer) {
        super(question, answer);
    }

    public boolean checkAnswer(String answer) {
        String correctAnswer = this.getTheAnswer();
        //answer = "A, B, C" or "a, b, c"
        return answer.equalsIgnoreCase(correctAnswer);
    }
}
