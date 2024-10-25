package studio;

public class MultipleChoice extends Question {

    public MultipleChoice(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        String correctAnswer = this.getTheAnswer();
        //answer = "'A' or 'C'" or "'a' or 'c'"
        return answer.equalsIgnoreCase(correctAnswer);
    }

}
