import java.util.Scanner;
public class Question_01 {
    public static void main(String[] args) {
        char[] english = { 'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4',
                '5', '6', '7', '8', '9', '0'};

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

        String m = "m";
        String t = "t";
        String e = "e";
        System.out.println("MorseCode: ");
        System.out.println("- ---    -... .    --- .-.    -. --- -    - ---    -... .");
        Scanner input = new Scanner(System.in);
        menu();
        while(true) {
            String userChoice = input.nextLine();
            System.out.println();
            if (userChoice.equals(m)) {
                System.out.println("Please enter a Morse Code: ");
                String phrase = input.nextLine();
                System.out.println();
                deCode(morse, english, phrase);
                menu();
            } else if (userChoice.equals(t)) {
                System.out.println("Please enter a English Statement: ");
                String phrase = input.nextLine();
                System.out.println();
                phrase = phrase.toLowerCase();
                System.out.println("MorseCode: ");
                enCode(morse, english, phrase);
                menu();
                System.out.println();
            } else if (userChoice.equals(e)) {
                System.out.println("Thanks for using this program!");
                break;
            }
        }
    }

    public static void menu(){
        System.out.println();
        System.out.println("Hello, this program allows you to translate text to morse code or translate morse code to text. \n");
        System.out.println("Please, select one of the below options:");
        System.out.println("*** Enter 't' for encoding text ");
        System.out.println("*** Enter 'm' for decoding morse code ");
        System.out.println("*** Enter 'e' to exit the program ");
    }

    public static void enCode(String[] morse, char[] english, String statement){
        System.out.println();
        for(int i = 0; i < statement.length(); i++){
            for(int j = 0; j < english.length; j++){
                if(statement.charAt(i) == english[j]) {
                    System.out.print(morse[j] + " ");
                    break;
                }
            }
            if(statement.charAt(i) == ' '){
                System.out.print("   ");
            }
        }
        System.out.println();
    }

    public static void deCode(String[] morse, char[] english, String statement){
        String[] array = statement.split(" ");
        System.out.println("Normal Text: ");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < morse.length; j++){
                if(array[i].equals(morse[j])){
                    System.out.print((char)(j+ 'A'));
                    break;
                }
            }
        }
        System.out.println();
    }


}