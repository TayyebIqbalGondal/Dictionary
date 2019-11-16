
import java.util.Scanner;

public class TextUserInterface {

    private Dictionary dict;
    private Scanner reader;

    public TextUserInterface(Scanner reader, Dictionary dict) {
        this.dict = dict;
        this.reader = reader;
    }

    public void start() {
        while (true) {
            System.out.print("Statement:");
            String input = reader.nextLine().trim().toLowerCase();
            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }
            else if(input.equals("add")){
            add();
            }
            else if(input.equals("translate")){
            translate();
            }
            else  {
                System.out.println("Unknown statement");
            }
        }
    }

    public void add() {
        System.out.print("In Finnish: ");
        String key = reader.nextLine().trim().toLowerCase();
        System.out.print("Translation: ");
        String value = reader.nextLine().trim().toLowerCase();
        dict.add(key, value);
    }
    public void  translate(){
     System.out.print("Give a word: ");
        String key = reader.nextLine().trim().toLowerCase();
        System.out.println( "Translation: "+dict.translate(key));
    }
}
