import java.util.*;


 class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ')
                count++;
        }

        System.out.println("Total chars: " + count);
    }
}