import java.util.Scanner;

abstract class TestQuestion {
    protected String question;

    protected abstract void readQuestion(Scanner scanner);

    public String getQuestion() {
        return question;
    }
}

class Essay extends TestQuestion {
    private int numBlankLines;

    public Essay(Scanner scanner) {
        readQuestion(scanner);
    }

    @Override
    protected void readQuestion(Scanner scanner) {
        numBlankLines = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        question = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Essay: " + question + "\n" + "Number of blank lines: " + numBlankLines + "\n";
    }
}

class MultChoice extends TestQuestion {
    private String[] choices;

    public MultChoice(Scanner scanner) {
        readQuestion(scanner);
    }

    @Override
    protected void readQuestion(Scanner scanner) {
        int numChoices = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        choices = new String[numChoices];
        for (int i = 0; i < numChoices; i++) {
            choices[i] = scanner.nextLine();
        }
        question = scanner.nextLine();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Multiple Choice: " + question + "\n");
        char label = 'a';
        for (String choice : choices) {
            sb.append(label).append(") ").append(choice).append("\n");
            label++;
        }
        return sb.toString();
    }
}

public class WriteTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numQuestions = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        TestQuestion[] testQuestions = new TestQuestion[numQuestions];

        for (int i = 0; i < numQuestions; i++) {
            char type = scanner.nextLine().charAt(0);
            if (type == 'e') {
                testQuestions[i] = new Essay(scanner);
            } else if (type == 'm') {
                testQuestions[i] = new MultChoice(scanner);
            }
        }

        for (int i = 0; i < numQuestions; i++) {
            System.out.println((i + 1) + ". " + testQuestions[i]);
        }

        scanner.close();
    }
}
