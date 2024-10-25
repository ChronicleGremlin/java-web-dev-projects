package studio;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    //variables
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);

    //constructor
    public Quiz() {

    }

    //methods

    //getter
    public ArrayList<Question> getQuestions() {
        return this.questions;
    }

    //add questions to Quiz
    //abstract classes in Question allows us to take in a general question type from child classes
    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    //runs the Quiz - method
    public void runQuiz() {
        //loop though each question
        for (Question question : questions) {
            //ask user question
            System.out.println(question.getTheQuestion());
            //get user answer
            String usersAnswer = this.getusersAnswers();
            //check user answer
            boolean userGotQuestionCorrect = question.checkAnswer(usersAnswer);
            //increment numberOfQuestionsCorrect if answered correctly
            if (userGotQuestionCorrect) {
                numberOfQuestionsCorrect++;
            }
        }
        //grade the quiz
        double percentageCorrect = ((double) this.numberOfQuestionsCorrect / (double) this.questions.size()) * 100;
        System.out.println("User's Grade: " + percentageCorrect + "%");
    }




    private String getusersAnswers() {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }
}
