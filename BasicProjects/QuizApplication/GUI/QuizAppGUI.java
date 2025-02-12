import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Question {
    private int id;
    private String question, opt1, opt2, opt3, opt4, answer;

    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) {
        this.id = id;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.answer = answer;
    }

    public String getQuestion() { return question; }
    public String getOpt1() { return opt1; }
    public String getOpt2() { return opt2; }
    public String getOpt3() { return opt3; }
    public String getOpt4() { return opt4; }
    public String getAnswer() { return answer; }
}

class QuestionService {
    private Question[] questions = new Question[5];
    private int currentQuestionIndex = 0;
    private int score = 0;

    public QuestionService() {
        questions[0] = new Question(1, "Size of int?", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "Size of double?", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "Size of char?", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "Size of long?", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "Size of boolean?", "1", "2", "4", "8", "1");
    }

    public Question getNextQuestion() {
        if (currentQuestionIndex < questions.length) {
            return questions[currentQuestionIndex++];
        }
        return null;
    }

    public void checkAnswer(String userAnswer) {
        if (questions[currentQuestionIndex - 1].getAnswer().equals(userAnswer)) {
            score++;
        }
    }

    public int getScore() {
        return score;
    }

    public boolean hasMoreQuestions() {
        return currentQuestionIndex < questions.length;
    }
}

public class QuizAppGUI extends JFrame implements ActionListener {
    private QuestionService questionService;
    private JLabel questionLabel;
    private JRadioButton option1, option2, option3, option4;
    private ButtonGroup optionsGroup;
    private JButton nextButton;
    private Question currentQuestion;

    public QuizAppGUI() {
        questionService = new QuestionService();
        setTitle("Quiz Application");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        questionLabel = new JLabel("Question will appear here");
        add(questionLabel, BorderLayout.NORTH);

        JPanel optionsPanel = new JPanel(new GridLayout(4, 1));
        option1 = new JRadioButton();
        option2 = new JRadioButton();
        option3 = new JRadioButton();
        option4 = new JRadioButton();
        optionsGroup = new ButtonGroup();

        optionsGroup.add(option1);
        optionsGroup.add(option2);
        optionsGroup.add(option3);
        optionsGroup.add(option4);

        optionsPanel.add(option1);
        optionsPanel.add(option2);
        optionsPanel.add(option3);
        optionsPanel.add(option4);

        add(optionsPanel, BorderLayout.CENTER);

        nextButton = new JButton("Next");
        nextButton.addActionListener(this);
        add(nextButton, BorderLayout.SOUTH);

        loadNextQuestion();
    }

    private void loadNextQuestion() {
        currentQuestion = questionService.getNextQuestion();
        if (currentQuestion != null) {
            questionLabel.setText(currentQuestion.getQuestion());
            option1.setText(currentQuestion.getOpt1());
            option2.setText(currentQuestion.getOpt2());
            option3.setText(currentQuestion.getOpt3());
            option4.setText(currentQuestion.getOpt4());
            optionsGroup.clearSelection();
        } else {
            JOptionPane.showMessageDialog(this, "Quiz Over! Your Score: " + questionService.getScore());
            System.exit(0);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (currentQuestion != null) {
            JRadioButton selectedOption = null;
            if (option1.isSelected()) selectedOption = option1;
            if (option2.isSelected()) selectedOption = option2;
            if (option3.isSelected()) selectedOption = option3;
            if (option4.isSelected()) selectedOption = option4;

            if (selectedOption != null) {
                questionService.checkAnswer(selectedOption.getText());
                loadNextQuestion();
            } else {
                JOptionPane.showMessageDialog(this, "Please select an option!");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuizAppGUI().setVisible(true));
    }
}
