import java.util.Scanner;

public class Wordcounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a random sentence: ");
        String stronk = sc.nextLine();
        char[] ch = stronk.toCharArray();
        int amount = 0;

        for (int i = 0; i < stronk.length(); i++) {
            if (Character.isLetter(ch[i]))
                amount++;
        }
        System.out.println("Letters: " + amount);
    }
}