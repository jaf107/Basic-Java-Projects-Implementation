package Flashcard;

public class FlashCard {
    private String question;
    private String answer;

    FlashCard(String q, String a)
    {
        this.answer = a;
        this.question = q;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
