package studio;

public abstract class Question {

    private final String theQuestion;
    private final String theAnswer;

    protected Question(String question, String answer) {
        this.theQuestion = question;
        this.theAnswer = answer;
    }


    //getters (set questions in addQuestion in Quiz class)
    public String getTheQuestion() {
        return theQuestion;
    }

    public String getTheAnswer() {
        return theAnswer;
    }

    //methods
    public abstract boolean checkAnswer(String answer);
}
