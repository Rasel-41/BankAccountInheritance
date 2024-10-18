package Question1;

public class Question {
    private String text;
    private String answer;

    public Question() {
        text = " ";
        String answer = " ";
    }

    public void setText(String questionText) {
        this.text = questionText;
    }

    public void setAnswer(String correctResponse ) {
        this.answer = correctResponse;
    }
    public boolean checkAnswer(String response) {
return response.equals(answer);
    }
    public void display(){
        System.out.println(text);
    }
}
