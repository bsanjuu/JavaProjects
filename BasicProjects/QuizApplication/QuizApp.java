

public class QuizApp {
    public static void main(String[] args) {

        QuestionService questionService = new QuestionService();
        questionService.playQuiz();
        questionService.printScore();
}
}
