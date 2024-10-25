package studio;

public class TrueFalse extends Question{

    public TrueFalse(String question, String answer) {
        super(question, answer);
    }

    public boolean checkAnswer(String answer) {
        String correctAnswer = this.getTheAnswer();
        //answer = "TRUE" or "true" or "FALSE" or "false"
        return answer.equalsIgnoreCase(correctAnswer);
    }
}
