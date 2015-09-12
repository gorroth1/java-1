import skilstak.c;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class eightball {

    static List<String> answers = Arrays.asList("Yes!","No.","Maybe.","Realy?","IDK!","What, I wasn't listening","YEAAAAA","No just no!","Maybe, or maybe I'm lying to you!","All I know is I like pancakes!","You smell","UUUHHHHHH","Did you say something?");
    
    private static String choice(List list) {
        int index = ThreadLocalRandom
                    .current()
                    .nextInt(list.size());
        return (String) list.get(index);
    }

    private static String input(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }

    public static final void main(String[] args) {
        System.out.print(c.cl + c.y + "\nWelcome to the Magic Eightball!\n");
        System.out.print("Enter your yes or no question below:\n\n" + c.x);
        while (true) {
            String question = input("-->" + c.b3);
            String answer = choice(answers);
            System.out.println(c.random() + answer + c.x);
        }
    }
}
