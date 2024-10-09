import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractices {
    public static void main(String[] args){

        HashMap<String, String> nameAndNumber = new HashMap<String, String>();
        HashMap<String, Integer> scanUserInput = new HashMap<String, Integer>();

        nameAndNumber.put("Syri", "073-377 77 77");
        nameAndNumber.put("Anno", "073-375 75 75");
        nameAndNumber.put("Ciaran", "073-355 55 55");

        System.out.println("What ice creams do you like and how many would you like?");
        Scanner userInput = new Scanner(System.in);
        String userWordInput = userInput.nextLine();
        String [] words = userWordInput.split(" ");

        for (String word : words) {
            Integer counter = scanUserInput.get(word);
            if (counter == null){ scanUserInput.put(word, 1); }
            else { scanUserInput.put(word, counter + 1); }
        }
        System.out.println(scanUserInput);
    }
}