import java.sql.SQLOutput;
import java.util.Scanner;

public class fraga {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println();
        korrektsvar();
        String omförsök = "ja";

        Scanner input = new Scanner(System.in);
    }

    static void korrektsvar() {
        Scanner input = new Scanner(System.in);
        String omförsök;
        String omkörning;
        do {
            System.out.println("Matte");
            int x = (int) (Math.random() * 10) + 1;
            int y = (int) (Math.random() * 10) + 1;

            System.out.println("Vad är summan av " + y + "+" + x + "?");
            double answer = 0.0;
            answer = input.nextDouble();
            if (answer == x + y) {
                System.out.println("Du har fått rätt ");
            }
            while (answer != x + y) {
                System.out.println("Du har fått fel svar ");
                System.out.println();
                System.out.println("Försök igen stolpskott! ");
                System.out.println("Vad är " + y + "+" + x + "?");
                answer = input.nextDouble();
            }
            System.out.println();

            System.out.println("Vill du få ett nytt tal, skriv ja ");
            omkörning = input.next();
            input.nextLine();
            System.out.println();
            } while (omkörning.equalsIgnoreCase("ja"));
        }
    }

