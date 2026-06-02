import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        int score = Asker();
        float result = Score(score);
        System.out.println("Your final score is: " + result);
    }

    static List<String> questions = new ArrayList<>();
    static {
    questions.add("What is 5*5?");
    questions.add("What is 25/4?");
    questions.add("What is 3^3?");
    }

    static List<Float> answers = new ArrayList<>();
    static {
    answers.add(25f);
    answers.add(6.25f);
    answers.add(27f);
    }

    public static int Asker() {
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < questions.size(); i++) {
            System.out.println(questions.get(i));
            float answer = scanner.nextFloat();
            if(Float.compare(answer, answers.get(i)) == 0) {
                score++;
            }
        }
        scanner.close();
        return score;
    }

    public static float Score(float score) {
        float finalScore = (score/3) * 100;
        return finalScore;
    }
}
