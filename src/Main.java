import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Logic converter = new Logic();
        Scanner scan = new Scanner(System.in);
        System.out.println("Write either a letter (a-z), a number (0-9) or a symbol (.,?) followed by enter OR you can write their morse equivalence");
        System.out.println("If you want to end the program write 'stop'");

        while (true) {
            try {
                String input = scan.nextLine();
                if (!input.equalsIgnoreCase("stop")) {
                    String output; //deklarerar här och initierar nedan i if-satsen
                    if (input.matches("[*-]+")) { //Om input är morsekod genom (* eller -) + för att ta hänsyn till upprepningar av tecken
                        output = converter.getLetter(input);
                    } else { //Om input inte är morsekod, här bokstäver, siffror eller .,?
                        output = converter.getMorse(input);
                    }
                    System.out.println(output);
                } else {
                    break;
                }
            } catch (Exception e){
                System.out.println("Something went wrong. Make sure you write either a letter (a-z), a number (0-9) or a symbol (.,?) followed by enter OR you can write their morse equivalence");
            }
        }
    }
}
