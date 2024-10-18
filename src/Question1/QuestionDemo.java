package Question1;

import java.util.Scanner;

public class QuestionDemo {
    public static void main(String[] args) {
        Question question = new Question();
        Scanner input = new Scanner(System.in);
        question.setText("Who is the inventor of java");
        question.setAnswer("Rasel tR");
        question.display();
        System.out.println("Your answer is : ");
        String response = input.nextLine();
        System.out.println(question.checkAnswer(response));
    }
}
