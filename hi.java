
import skilstak.c;
import java.util.Scanner;

public class hi {
    public static void main(String[] args) {
        System.out.println(c.clear);
        System.out.println(c.o + "Hi, whats youre name" + c.reset);
        System.out.print(c.r + "-->" + c.reset);
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(c.b + "Well hello " + c.o + "there " + name); 
    }
}
