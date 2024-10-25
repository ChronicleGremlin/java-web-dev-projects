package studio;

public class LinearScale extends Question{

    //Variables
    private int lowValue;
    private int highValue;

    //constructor
    public LinearScale(String question, int lowValue, int highValue) {
        super(question, null);
        this.lowValue = lowValue;
        this.highValue = highValue;
    }

    // Getter
    public int getLowValue() {
        return this.lowValue; }

    public int getHighValue() {
        return this.highValue; }

    @Override
    public boolean checkAnswer(String answer) {
        int answerAsInt = Integer.parseInt(answer);
        return answerAsInt >= lowValue && answerAsInt <= highValue;

    }
}
