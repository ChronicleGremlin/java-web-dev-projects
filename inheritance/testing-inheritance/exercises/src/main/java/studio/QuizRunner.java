package studio;

public class QuizRunner {
    public static void main(String[] args) {

        Quiz myQuiz = new Quiz();

        MultipleChoice myMultipleChoiceQuestion = new MultipleChoice("Which animal meows?" + "\nA: Cat" + "\nB: Dog" + "\nC: Rat" + "\nD: Elephant" +"\nPlease just type a single letter as an answer!", "A");
        myQuiz.addQuestion(myMultipleChoiceQuestion);

        Checkbox myCheckboxQuestion = new Checkbox("Which candies have chocolate in or on them?" + "\nA: Twix" + "\nB: Smarties" + "\nC: M&Ms" + "\nD: Heath" + "\nPlease type all answers seperated by commons! Ex. 'A, B, C, D", "A, C, D");
        myQuiz.addQuestion(myCheckboxQuestion);

        LinearScale myLinearScale = new LinearScale("On a scale from 1-10 how cool are hyenas?",7, 10);
        myQuiz.addQuestion(myLinearScale);

        TrueFalse myTrueFalse = new TrueFalse("True or False? Oranges, tangerines, lemons, and limes are all citrus." + "\nPlease type 'true or false'!","true");
        myQuiz.addQuestion(myTrueFalse);

        myQuiz.runQuiz();
    }
}
